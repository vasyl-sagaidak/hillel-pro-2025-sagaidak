package lesson_10_Java_IO;

import java.io.FileReader;
import java.io.IOException;

// Чтение из файла, который уже существует
// Использование конструктора public FileReader(String fileName)
public class FileReaderExample {

    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Путь к файлу
        String path = BASE_PATH + "lesson10_myfile.txt";
        // Вызов методов чтения файла и выведения результата в консоль
        getOutput(readFile(path));
    }

    private static String readFile(String path) {
        // try-with-resources
        try (FileReader reader = new FileReader(path)) {
            // Читаем файл по 1 символу
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
            stringBuilder.append((char)sym);
            }
            return stringBuilder.toString();
         } catch (IOException e) {
            return e.getMessage();
        }
    }

    // Выводим содержимое файла (в случае успеха) либо сообщение об исключении в консоль
    private static void getOutput(String message) {
        System.out.println(message);
    }
    // Результатом работы кода будет сообщение в консоли "Some information." прочитанное
    // из файла lesson10_myfile.txt (по соответствующему пути).
}
