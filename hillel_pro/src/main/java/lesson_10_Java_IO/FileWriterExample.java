package lesson_10_Java_IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Cоздание и запись файла во внешнюю папку относительно проекта
 * которая уже есть на локальной машине.
 */
public class FileWriterExample {
    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Имя создаваемого файла
        String myFile = "lesson10_myfile.txt";
        // Текст для записи в создаваемый файл
        String myText = "Some information from FileWriter.";
        // try-with-resources
        try (FileWriter fw = new FileWriter(BASE_PATH + myFile)) {
            fw.write(myText);
        // Вывод сообщения в случае успеха.
            System.out.println("Success.");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    /**
     * Результатом работы кода будет создание файла lesson10_myfile.txt (c соответствующим путем к нему) с
     * текстом содержания "Some information from FileWriter."
     */
}
