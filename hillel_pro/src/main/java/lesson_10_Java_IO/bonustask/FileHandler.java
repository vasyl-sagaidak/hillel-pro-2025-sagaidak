package lesson_10_Java_IO.bonustask;

import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public String readFile(String path) {
        try(FileReader reader = new FileReader(path)) {
        int sym;
        StringBuilder stringBuilder = new StringBuilder();
        while((sym = reader.read()) != -1) {
            stringBuilder.append((char)sym);
        }
        return stringBuilder.toString();
        }  catch (IOException e) {
            return e.getMessage();
        }
    }
}
