package lesson_11_Java_NIO.livecoding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaNIOMain {
    public static void main(String[] args) throws IOException {
        try {
            Files.readString(Paths.get("test.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Files.writeString(Paths.get("test.txt"), "214124");
    }
}
