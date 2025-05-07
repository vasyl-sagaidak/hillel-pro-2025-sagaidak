package lesson_33_Communication_In_Network.homework.runners;

import lesson_33_Communication_In_Network.homework.MyServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRunner {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1111)) {
            System.out.println("[SERVER] Сервер запущено на порту 1111");
            while(true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new MyServer(clientSocket)).start();
            }
        }
    }
}
