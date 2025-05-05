package lesson_33_Communication_In_Network.classwork;

import org.example.model.Account;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

        public class Reader {
            public static void main(String[] args) {
                try (FileInputStream fileInputStream = new FileInputStream("account.txt")) {
                    try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                        Account account = (Account) objectInputStream.readObject();
                        System.out.println(account.getId());
                        System.out.println(account.getFirstName());
                        System.out.println(account.getSecondName());
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
    }
    }
}
