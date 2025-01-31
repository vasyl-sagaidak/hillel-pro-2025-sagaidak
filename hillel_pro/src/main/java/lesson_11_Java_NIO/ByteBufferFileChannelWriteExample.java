package lesson_11_Java_NIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// Создание и запись в файл
public class ByteBufferFileChannelWriteExample {

// Путь к внешней папке.
//  / - корневой каталог, в терминах Windows - это,например, C:\\
    private final static String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) throws IOException {
        // Контент для записи в файл
        String content = "Some information using Class ByteBuffer and Class FileChannel of JAVA NIO API.";
        // Путь к файлу
        String filePath = BASE_PATH + "my-NIO-file.txt";
        getOutput(writeToFile(content, filePath));
    }

    // Метод создания и записи в файл
    public static String writeToFile(String content, String filePath)
            throws IOException {
        FileChannel fileChannel;

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Кодируем строчный контент в последовательность байтов.
            byte[] contentBytes = content.getBytes();
            // Выделяем новый байтовый буфер
            // при помощи метода allocate()
            ByteBuffer byteBuffer = ByteBuffer.allocate(contentBytes.length);
            // Передаем все содержимое данного исходящего массива байтов
            // в этот буфер через вызов метода put()
            byteBuffer.put(contentBytes);
            // Получение FileChannel через FileOutputStream
            fileChannel = fos.getChannel();
            // Готовим буфер к чтению
            byteBuffer.flip();
            // Метод write() записывает данные в файл, который предварительно создается.
            // Данный метод принимает буфер как параметр на вход.
            fileChannel.write(byteBuffer);
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        // Закрываем канал
        fileChannel.close();
        return "The content has been written";
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }

    // Результатом работы программы будет создание файла myNIOfile.txt (по указанному пути) с текстом:
    // Some information using Class ByteBuffer and Class FileChannel of JAVA NIO API.
}
