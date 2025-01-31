package lesson_10_Java_IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Cоздание и запись файла во внешнюю папку относительно проекта
 * которая уже есть на локальной машине.
 */
public class FileOutputStreamExample {

    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
// Конструкция try-catch позволяет: выловить ошибки, автоматически закрыть файл
// и освободить ресурсы, что бы небыло утечки памяти.
        try {
            // Имя файла который создается
            String fileName = "lesson10_myfile.txt";
            // Имя файла который создается, с путем к нему.
            String myFile = BASE_PATH + fileName;
            FileOutputStream fout = new FileOutputStream(myFile);
            // Текст для записи в файл, который создается
            String myText = "Some information.";
            // Конвертация строки в байты
            byte[] someBytes = myText.getBytes();
            // Поток записи в файл
            fout.write(someBytes);
            // Закрытие потока
            fout.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            System.exit(0);
            /**
             * В случае исключительной ситуации,
             * это сообщение не должно появится, поскольку прописано
             * прерывание программы.
             */
            System.out.println("Success :)");
        }
    }
    /**
     * Результатом работы кода будет создание файла myfile.txt (по соответствующему пути)
     * с текстомс содержания "Some information."
     */
}
