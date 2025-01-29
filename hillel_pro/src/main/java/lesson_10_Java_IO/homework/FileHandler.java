package lesson_10_Java_IO.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private static final String sp = File.separator;
    private static final String BASE_PATH = "src"+sp+"main"+sp+"java"+sp
            +"lesson_10_Java_IO"+sp+"homework"+sp+"files"+sp;

    public String writeFile(String fileName, String fileContent) {
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(BASE_PATH + fileName + ".txt"))) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    public String readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}