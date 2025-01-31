package lesson_11_Java_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Чтение из файла при помощи NIO2 (java.nio.file)
public class NIO2ReadFromFileExample {

    // Путь к внешней папке.
    //  / - корневой каталог, в терминах Windows - это,например, C:\\
    private final static String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Название файла из которого будет происходить чтение данных
        String fileName = "nio2-test-create-and-write-to-file.txt";
        // Полный путь к файлу из которого будем читать
        String strPath = BASE_PATH + fileName;
        // Вызов методов манипуляции с файлом
        getOutput(readFromFile(strPath));
    }

    // Метод чтения из файла
    private static String readFromFile(String strPath) {
        try {
            // Метод Files.readString() считывает все содержимое
            // из файла в строку, декодируя из байтов в символы (строковые литералы).
            return Files.readString(
                    Path.of(strPath) // <- Здесь, конвертация String в Path
            );
        } catch (IOException e) {
            // throw new RuntimeException("Something wrong", e);
            return "Something went wrong: " + e.getMessage();
        }
    }

    // Вывод сообщения о результате работы программы
    private static void getOutput(String out) {
        System.out.println(out);
    }
}
