package lesson_10_Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Чтение с уже существующего файла
public class BufferedReaderExample {

    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Путь к файлу
        String path = BASE_PATH + "lesson10_myfile.txt";
        // Вызов методов обработки файла и выведения результата в консоль
        getOutput(handleFile(path));
    }

    // Обработка файла
    private static String handleFile(String path) {
        // try-with-resources
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(path))) {
            // Читаемо по символам
            int symbol;
            StringBuilder sb = new StringBuilder();
            while ((symbol = bufferedReader.read()) != -1) {
             sb.append((char) symbol);
            }
            return sb.toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    // Выводим содержимое файла (в случае успеха) либо сообщение о эксепшне в консоль
    private static void getOutput(String output) {
        System.out.println(output);
    }

    // Результатом выполнения кода будет выведение в консоль из файла lesson10_myfile.txt
    // (по соответствующему пути), текста следующего содержания: "Some information."
}
