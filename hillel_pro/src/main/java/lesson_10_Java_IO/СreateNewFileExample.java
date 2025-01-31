package lesson_10_Java_IO;


import java.io.File;
import java.io.IOException;

// Создание нового файла.
// Результат: Создание файла с определенным именем по определенному пути.
public class СreateNewFileExample {
    static File file;
    // Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        // Название нового файла
        String fileName = "CreateNewFileTest.txt";

        try {
            file = new File(BASE_PATH + fileName);
            if (file.createNewFile()) {
                // Вывод информации в консоль в случае успеха
                System.out.println("File has created :)");
            } else {
                // Вывод информации в консоль в случае если файл с данным именем уже существует.
                System.out.println("File already exists :/");
            }
        } catch (IOException e) {
            // Вывод информации в консоль при провале
            System.out.println(e.getMessage());
        }
    }
    // Результатом выполнения данного кода будет создание файла с именем CreateNewFileTest.txt по указанному пути,
    // выведение в консоль "File has created :)" в случае успеха, либо "File already exists :/" в случае
    // если файл с таким именем уже существует по указанному пути.
}
