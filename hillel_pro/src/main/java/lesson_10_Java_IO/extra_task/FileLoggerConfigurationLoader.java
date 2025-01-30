package lesson_10_Java_IO.extra_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    private String resourceFilePath;
    private String logLevel;
    private Long maxSize;
    private String fileFormat;

    public FileLoggerConfiguration load(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
             String[] lines = line.split(":");
                switch (lines[0]) {
                    case "FILE":
                        resourceFilePath = lines[1];
                        break;
                    case "LEVEL":
                        logLevel = lines[1];
                        break;
                    case "MAX-SIZE":
                        maxSize = Long.valueOf(lines[1]);
                        break;
                    case "FORMAT":
                        fileFormat = lines[1];
                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Can not read from file", e);
        }
        return new FileLoggerConfiguration(resourceFilePath, logLevel, maxSize, fileFormat);
    }
}
