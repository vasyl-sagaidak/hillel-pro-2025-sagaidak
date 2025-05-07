package lesson_33_Communication_In_Network.homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.ActiveConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class AbstractClient {
    private static final Logger LOGGER = LogManager.getLogger(AbstractClient.class);

    public void invoke() {
        try (Socket clientSocket = new Socket()) {
            clientSocket.connect(new InetSocketAddress("localhost", 1111), 2000);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            ActiveConnection activeConnection = new ActiveConnection(clientSocket);
            objectOutputStream.writeObject(activeConnection);
            objectOutputStream.flush();

            LOGGER.info("Підключено до сервера");

            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Scanner userInput = new Scanner(System.in);

            System.out.println("Введіть команду (list / exit):");
            while(userInput.hasNextLine()) {
                String command = userInput.nextLine();
                printWriter.println(command);

                if (command.equals("exit")) {
                    LOGGER.info("Виконано вихід із сервера");
                    break;
                }

                String response;
                while ((response = serverInput.readLine()) != null) {
                    if (response.equals("END")) {
                        break;
                    }
                    System.out.println(response);
                }
            }
        } catch (IOException e) {
            LOGGER.error("Помилка з'єднання з сервером", e);
        }
    }
}
