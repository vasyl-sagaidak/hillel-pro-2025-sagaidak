package lesson_33_Communication_In_Network.classwork;

import org.example.model.Account;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {
    public static void main(String[] args) {
        Account account = new Account(1, "first", "second", "common");

        try (FileOutputStream fileOutputStream = new FileOutputStream("account.txt")) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(account);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
