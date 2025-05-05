package org.example;

import org.example.model.Account;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main( String[] args ) throws IOException {
//     try (Socket socketClient = new Socket("localhost", 1111)) {
//         try(PrintWriter printWriter = new PrintWriter(socketClient.getOutputStream(), true)) {
//             Scanner scanner = new Scanner(System.in);
//             while (scanner.hasNextLine()) {
//                 printWriter.println(scanner.next());
//             }
//         }
//     }

      try (Socket socketClient = new Socket("localhost", 1111)) {
          try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(socketClient.getOutputStream())) {
              for (int i = 0; i < 100; i++) {
                  Account account = new Account(i, "first"+i, "second"+i, "common"+i);
                  objectOutputStream.writeObject(account);
              }
              objectOutputStream.flush();
          }
      }
    }
}
