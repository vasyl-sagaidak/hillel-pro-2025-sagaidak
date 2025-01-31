package lesson_10_Java_IO;

import java.io.File;

// Создание новой папки.
// Результат: Создание папки с определенным именем по определенному пути.
public class CreateNewCatalogExample {

    //Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Название новой папки
        String dir = "Java-Catalog";
        // Обьект File для каталога/папки
        File folder = new File(BASE_PATH + dir);
        // При помощи метода mkdir() создаем папку по определенному пути
        boolean isCreated = folder.mkdir();

        if (isCreated) {
            // Вывод информации в консоль в случае успеха операции
            System.out.println("Fold done...");
        } else {
            // Вывод информации в консоль при провале операции
            System.out.println("Something went wrong :(");
        }
     }
     // Результатом выполнения данного кода будет создание папки с именем Java-Catalog по указанному пути,
     // выведение в консоль "Fold done..." в случае успеха, либо "Something went wrong :(" в случае провала.
}
