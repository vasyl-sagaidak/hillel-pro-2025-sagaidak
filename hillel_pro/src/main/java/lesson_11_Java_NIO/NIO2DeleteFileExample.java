package lesson_11_Java_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Удаление файла при помощи NIO2 (java.nio.file)
public class NIO2DeleteFileExample {

    // Путь к внешней папке.
    //  / - корневой каталог, в терминах Windows - это,например, C:\\
    private final static String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Имя удаляемого файла
        String fileName = "nio2-test-create-and-write-to-file.txt";
        // Полный путь к файлу который будем удалять
        String path = BASE_PATH + fileName;
        // Вызов методов манипуляции с файлом
        getOutput(deleteFile(path));
    }

    // Метод удаления файла
    private static String deleteFile(String strPath) {
        try {
            // Метод Files.delete() удаляет файл
            Files.delete(Path.of(strPath));
            // Сообщение об удалении файла
            return "File has been successfully deleted!";
        } catch (IOException e) {
            // throw new RuntimeException("Something went wrong :0", e);
            return "Something went wrong: " + e.getMessage();
        }
    }

    // Вывод в консоль сообщения о результате работы программы
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
