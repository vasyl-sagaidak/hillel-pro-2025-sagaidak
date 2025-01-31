package lesson_11_Java_NIO;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Создание нового файла и запись данных в него при помощи NIO2 (java.nio.file)
public class NIO2CreateAndWriteToFileExample {

    // Путь к внешней папке.
    //  / - корневой каталог, в терминах Windows - это,например, C:\\
    private final static String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
    // Название нового файла
    String newFileName = "nio2-test-create-and-write-to-file.txt";
    // Контент для нового файла
    String content = "This text is to be written into nio2-test-create-and-write-to-file.txt file";
    // Путь для нового файла
    String strPath = BASE_PATH + newFileName;
    // Вызовы методов и манипуляции с файлом
    getOutput(createFile(strPath));
    getOutput(writeToFile(
            Paths.get(strPath), // <- Конвертация String в Path
            content
            ));
    }

    // Метод создания файла
    private static String createFile(String strPath) {
        Path newFile;
        try {
            // Метод Files.createFile() создает
            // новый пустой файл
            newFile = Files.createFile(Path.of(strPath));
        } catch (FileAlreadyExistsException e) {
            // Сообщение о том, что такой файл уже существует
            return "File already exists!";
        } catch (IOException e) {
            throw new RuntimeException("Something wrong ", e);
        }
        // Сообщение о том, что файл по соответствующему пути был создан
        return newFile + " created!";
    }

    // Метод записи в файл
    private static String writeToFile(Path path, String content) {
        try {
            // Метод Files.writeString() записывает
            // последовательность символов в файл
            Files.writeString(path, content);
        } catch (IOException e) {
            return e.getMessage();
        }
        // Сообщение об успешной записи данных в соответствующий файл
        return "Recorded in: " + path;
    }

    // Метод выводящий сообщение с результатом работы программы
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
