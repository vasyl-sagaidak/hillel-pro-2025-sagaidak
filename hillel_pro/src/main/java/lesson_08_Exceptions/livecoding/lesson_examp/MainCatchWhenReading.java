package lesson_08_Exceptions.livecoding.lesson_examp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Чтение файла через File IO API
public class MainCatchWhenReading {

    //Путь к внешней папке.
    // / - корневой каталог, в терминах Windows - это, например, C:\
    private static final String BASE_PATH = "/Username/Files/";

    static File file;
    static FileReader fr;
    static String fileName;

    public static void main(String[] args) {
        //Файл который не сущестует
        fileName = "myfile.txt";

        //Обработка исключения в отношении работы с файлом
        try {
            //Работа с файлами через File IO API
            file = new File(BASE_PATH + fileName);
            fr = new FileReader(file);
            //Читаем символы
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException ex) {
            //Здесь перехват исключения относящегося к наличию файла.
            //Если файла не существует, то выводится соответствующее сообщение про исключение.
            System.out.println("Exception" + ex.getMessage());
        } catch (IOException ex) {
            //Здесь перехват исключения относящегося к использованию File IO API.
            //При отсутствии возможности использования File IO API, выводится
            //соответствующее сообщение об исключении.
            System.out.println("Exception" + ex.getMessage());
        }
    }
}
