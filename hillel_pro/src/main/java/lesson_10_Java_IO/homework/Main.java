package lesson_10_Java_IO.homework;

import java.io.File;

public class Main {

    private static final String sp = File.separator;
    private static final String BASE_PATH = "src"+sp+"main"+sp+"java"+sp
            +"lesson_10_Java_IO"+sp+"homework"+sp+"files"+sp;

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile";
        String fileContent = "My very important information";
        String result = handler.writeFile(fileName, fileContent);
        String content = handler.readFile(BASE_PATH + fileName + ".txt");
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
