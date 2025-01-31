package lesson_10_Java_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Создание и запись в файл
public class BufferedWriterExample {

    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Имя создаваемого файла
        String myFile = "lesson10_myfile.txt";
        // Текст для записи в создаваемый файл
        String myText = "Some information from BufferedWriter.";
        // Вызов методов обработки файла и вывода результата в консоль
        getOutput(handleFile(myFile, myText));
    }

    // Обработка файла
    private static String handleFile(String fileName, String text) {
        // try-with-resources
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(BASE_PATH + fileName))) {
            // Поток записи в файл
            bufferedWriter.write(text);
            return "Success.";
        } catch (IOException e) {
            return "Exception: " + e.getMessage();
        }
    }

    // Выводим сообщение про создание и запись в файл (при успехе)
    // либо сообщение про исключение в консоль
    public static void getOutput(String message) {
        System.out.println(message);
    }

    // Результатом выполнения кода будет создание файла lesson10_myfile.txt (по соответствующему пути)
    // с текстом внутри, следующего содержания: "Some information from BufferedWriter."
}
