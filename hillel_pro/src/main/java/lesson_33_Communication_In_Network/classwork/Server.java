package lesson_33_Communication_In_Network.classwork;

import org.example.model.Account;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
//        try (ServerSocket serverSocket = new ServerSocket(1111)) {
//            Socket accept = serverSocket.accept();
//            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()))) {
//                String message;
//                while ((message = bufferedReader.readLine()) != null) {
//                    System.out.println(message);
//                }
//            }
//       }
        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            while (true) {
                Socket accept = serverSocket.accept();
                new Thread(() -> {
                    try (ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream())) {
                        try {
                            Account account;
                            while ((account = (Account) objectInputStream.readObject()) != null) {
                                System.out.println(account.getId());
                                System.out.println(account.getFirstName());
                                System.out.println(account.getSecondName());
                                System.out.println(account.getCommonName());
                            }
                        } catch (EOFException e) {
                            System.out.println("CLient was disconnected.");
                        }
                   } catch (IOException | ClassNotFoundException e) {
                       throw new RuntimeException(e);
                   }
                }).start();
            }
        }
    }
}
