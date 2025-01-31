package lesson_11_Java_NIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Чтение из файла
 * Читаем данные из FileChannel, вызывая метод read().
 *
 * Сначала выделяется буфер (ByteBuffer)/
 * Данные, считанные из FileChannel, считываются в буфер.
 *
 * Потом вызывается метод FileChannel.read().
 * Этот метод считывает данные с FileChannel в буфер.
 * Целое число, возвращаемое методом read(), сообщает, сколько
 * байтов было записано в буфер.
 * Если возвращается -1, достигнут конец файла.
 */
public class ByteBufferFileChannelReadExample {

    // Путь к внешней папке.
    //  / - корневой каталог, в терминах Windows - это,например, C:\\
    private final static String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) throws IOException {
        String filePath = BASE_PATH + "my-NIO-file.txt";
        getOutput(readFile(filePath));
    }

    // Метод для чтения нашего файла
    public static String readFile(String filePath) throws IOException {

        FileChannel fileChannel;
        StringBuilder builder;

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Получение FileChannel через FileInputStream
            fileChannel = fis.getChannel();
            // выделяем новый байтовый буфер
            // через метод allocate() с емкостью в байтах
            ByteBuffer buffer = ByteBuffer.allocate(128);
            // Cоздаем StringBuilder для считывания данных
            builder = new StringBuilder();
            // Метод read() считывает данные с FileChannel в буфер
            while (fileChannel.read(buffer) != -1) {
                buffer.flip();
                builder.append(Charset.defaultCharset().decode(buffer));
                // Готовим буфер к записи
                buffer.clear();
            }
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        // Закрываем канал
        fileChannel.close();
        // Возвращаем результат чтения
        return builder.toString();
    }

    // Вывод в консоль результата работы программы
    public static void getOutput(String output) {
        System.out.println(output);
    }
    // Результатом работы кода будет выведение в консоль данных из файла my-NIO-file.txt расположенного по
    // соответствующему пути.
    // Текст: Some information using Class ByteBuffer and Class FileChannel of JAVA NIO API.
}
