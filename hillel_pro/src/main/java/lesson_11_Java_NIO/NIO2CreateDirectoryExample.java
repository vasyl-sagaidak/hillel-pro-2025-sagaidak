package lesson_11_Java_NIO;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Создание новой директории/каталога/папки при помощи NIO2 (java.nio.file)
public class NIO2CreateDirectoryExample {

    // Путь к внешней папке.
    //  / - корневой каталог, в терминах Windows - это,например, C:\\
    private final static String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Название новой дериктории
        String newDirName = "docs";
        // Путь к новой директории
        String newPath = BASE_PATH + newDirName;
        // Вызов методов манипуляции с директорией
        getOutput(makeDir(newPath));
    }

    // Метод создания новой директории
    private static String makeDir(String newPath) {
        // Превращаем String значение в Path значение
        Path path = Paths.get(newPath);
        Path newDir;
        try {
            // Метод Files.createDirectory() создает
            // новую директорию из экземпляра Path.
            newDir = Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            // Сообщение о том, что директория с таким названием
            // и таким путем уже существует
            return "Directory already exists!";
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
        // Сообщение об успешном создании директории
        // по соответствующему указанному пути.
        return newDir + " created!";
    }

    // Вывод сообщения о результате работы программы
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
