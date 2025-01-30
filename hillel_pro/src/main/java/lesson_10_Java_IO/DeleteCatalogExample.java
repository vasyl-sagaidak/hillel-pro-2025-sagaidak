package lesson_10_Java_IO;

import java.io.File;

// Удаление папки
// Результат: удаление папки с определенным именем,
// по определенному пути.
public class DeleteCatalogExample {

// Путь к внешней папке.
//  / - корневой каталог, в терминах Windows - это,
//  например, C:\\
private final static String BASE_PATH = "src/main/java/resources/";

public static void main(String[] args) {

    // Имя папки, которую нужно удалить
    String folder = "Java_Development_Kit";

    // Обьект File для каталога/папки
    File delFolder = new File(BASE_PATH + folder);
    // Удаление каталога/папки при помощи метода delete()
    boolean isDeleted = delFolder.delete();

    if (isDeleted) {
        // Вывод информации в консоль в случае успеха
        System.out.println("Fold has deleted!");
    } else {
        // Вывод информации в консоль в случае провала
        System.out.println("Something went wrong :(");
    }
}
}
