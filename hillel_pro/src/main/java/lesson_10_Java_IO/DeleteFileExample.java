package lesson_10_Java_IO;

import java.io.File;

// Удаление файла.
// Результат: удаление файла с определенным именем по определенному пути.
public class DeleteFileExample {
    private static String fileName;
    private static File file;
    // Путь к внешней папке. / - корневой каталог, в терминах Windows - это, например, С:\\
    public static final String BASE_PATH = "src/main/java/resources/";

    public static void main(String[] args) {
        try {
            fileName = "CreateNewFileTest.txt";
            file = new File(BASE_PATH + fileName);
            // delete() возвращает true, если файл удален, и false - если нет.
            if (file.delete()) {
                // Вывод информации в консоль в случае успешного удаления файла
                System.out.println(file.getName() + "-deleted!");
            } else {
                // Вывод информации в консоль в случае невозможности удаления либо отсутствия такого файла.
                System.out.println("File does not exist or not deleted!");
            }
        } catch (Exception e) {
            // Вывод информации в консоль при провале операции
            System.out.println(e.getMessage());
        }
    }
    // Результатом выполнения кода будет удаление файла с указанным именем и вывод в консоль сообщения
    //"CreateNewFileTest.txt-deleted!" в случае успеха операции, либо сообщения "File does not exist or not
    // deleted!" в случае провала операции.
}
