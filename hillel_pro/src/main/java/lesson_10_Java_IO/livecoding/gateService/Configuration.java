package lesson_10_Java_IO.livecoding.gateService;

import java.io.BufferedReader;
import java.io.FileReader;

public class Configuration {
    private String environment;

    public void readProperties(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
          String line;
          while ((line = reader.readLine()) != null) {
              String[] properties = line.split("=");
              if (properties[0].equals("environment")) {
                  environment = properties[1];
              }
          }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getEnvironment() {
        return environment;
    }
}
