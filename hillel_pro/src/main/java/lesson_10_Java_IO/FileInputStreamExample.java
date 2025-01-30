package lesson_10_Java_IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Прочитаем файл, который уже создан и имеет некоторый текст.
 * Например "Some information."
 * При помощи цикла while считывается каждый отдельный байт в переменную i.
 * Когда в потоке больше нет данных для считывания, возвращается число -1.
 * Потом каждый считанный байт конвертируется в обьект типа Character
 * и выводится в консоль.
 */
public class FileInputStreamExample {
    static FileInputStream fin;
    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Имя файла из которого читаем данные
        String fileName = "lesson10_myfile.txt";
        // Имя файла, из которого читаем, с путем к нему
        String path = BASE_PATH + fileName;
        try {
            fin = new FileInputStream(path);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing stream: " + ex.getMessage());
            }
        }
    }
    // Результатом работы кода будет выведение в консоль с файла lesson10_myfile.txt (по соответствующему
    // пути) текста содержания: Some information.
}
