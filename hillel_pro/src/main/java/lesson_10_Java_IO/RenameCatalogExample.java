package lesson_10_Java_IO;

import java.io.File;

// Переименование папки.
// Результат: переименование папки с определенным именем,
// расположенной по определенному пути.
public class RenameCatalogExample {
    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {

        // Имя папки, которую мы хотим переименовать:
        String dir = "Java-Catalog";
         // Новое имя папки:
        String dirNew = "Java_Development_Kit";

        // Обьект File для каталога/папки, которую мы планируем переименовывать:
        File folder =new File (BASE_PATH + dir);
        // Обьект File для нового каталога/папки:
        File newFolder = new File (BASE_PATH + dirNew);
        // Переименование при помощи вызова метода renameTo() на обьекте папки которую хотим переименовать:
        boolean isRenamed = folder.renameTo(newFolder);

        if (isRenamed) {
            // Вывод информации в консоль в случае успеха:
            System.out.println("File renamed!");
        } else {
            System.out.println("Something went wrong");
        }
    }
    // Результат работы кода в переименовании указанного каталога/папки (по указанному пути),
    // а так же вывод в консоль слов "File renamed!" в случае успешной работы,
    // и "Something went wrong" в случае неудачи.
}
