package lesson_10_Java_IO.livecoding.gateService;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class GateService {
    private final String packagePath = "C:\\Users\\Skogarren\\projects\\hillel\\hillel_pro\\src" +
            "\\main\\java\\lesson_10_Java_IO\\livecoding\\gateService\\";
    private final Configuration configuration;

    public GateService() {
        configuration = new Configuration();
        configuration.readProperties(packagePath + "config.txt");
    }
    public void open() {
        logging("INFO: " + LocalDateTime.now() + " Gate was opened.");
    }

    public void close() {
        String message;
        LocalDateTime time = LocalDateTime.now();
        String s = time.toString();
        String substring = s.substring(s.length() - 1);
        int i = Integer.valueOf(substring);

        if(i == 5) {
            message = "ERROR: " + time + " Gate was closed incorrectly.";
        } else {
            message = "INFO: " + time + " Gate was closed.";
        }
        logging(message);
    }

    private void logging(String message) {
        String environment = configuration.getEnvironment();
        if (environment.equals("dev")) {
            System.out.println(message);
        } else if (environment.equals("prod")) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(packagePath + "log.txt", true))) {
                pw.println(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
