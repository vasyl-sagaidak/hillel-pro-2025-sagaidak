package lesson_33_Communication_In_Network.homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.ActiveConnection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class MyServer implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(MyServer.class);
    private static final AtomicInteger COUNTER = new AtomicInteger(0);
    private static final Map<String, ActiveConnection> ACTIVE_CLIENTS = new ConcurrentHashMap<>();

    private final Socket socket;
    private String clientName;

    public MyServer(Socket socket) {
        this.socket = socket;
    }

    private String generateName() {
        return "client-" + COUNTER.incrementAndGet();
    }

    @Override
    public void run() {
        try (
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Scanner scanner = new Scanner(socket.getInputStream());
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        ) {
        ActiveConnection client = (ActiveConnection) ois.readObject();
        clientName = generateName();
        client.setConnectionName(clientName);
        client.setConnectedAt(LocalDateTime.now());
        client.setSocket(socket);

        ACTIVE_CLIENTS.put(clientName, client);
        LOGGER.info("[SERVER] {} успішно підключився.", clientName);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                printWriter.println("Disconnecting...");
                ACTIVE_CLIENTS.remove(clientName);
                LOGGER.info("[SERVER] {} був видалений зі списку активних з'єднань.", clientName);
                break;
            } else if (input.equalsIgnoreCase("list")) {
                printWriter.println("==== Активні клієнти ====");
                ACTIVE_CLIENTS.forEach((name, connection) -> {
                    printWriter.println("- " + name + " (" + connection.getConnectedAt() + ")");
                });
            } else {
                printWriter.println("Unknown command " + input);
            }
        }
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.error("[SERVER] Помилка обробки клієнта {}: {}", clientName, e.getMessage());
        }
    }
}
