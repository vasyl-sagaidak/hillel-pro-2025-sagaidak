package lesson_10_Java_IO.extra_task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

public class FileLogger {
    private static final String LOGS_PATH = "src/main/java/lesson_10_Java_IO/extra_task/log_files";
    private final FileLoggerConfiguration fileLoggerConfiguration;
    private File file;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_HH-mm");
        this.fileLoggerConfiguration = fileLoggerConfiguration;
        this.file = new File(pathMorph(LOGS_PATH,
                "Log_" + LocalDateTime.now().format(dateTimeFormatter)
                        + fileLoggerConfiguration.getRecordFormat()));
    }

    public void debug(String message) throws FileMaxSizeReachedException  {
        if (isDebugLogLevel(fileLoggerConfiguration)) {
            if (ifHasFreeSpace(file, fileLoggerConfiguration)) {
                try (BufferedWriter bufferedWriter =
                             new BufferedWriter(new FileWriter(file, true))) {
                    bufferedWriter.newLine();
                    bufferedWriter.write("["+ LocalDateTime.now() +"] "
                            +"["+LoggingLevel.DEBUG.name()+"] "
                            + "Повідомлення: ["+message+"]");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("File not found", e);
                } catch (IOException e) {
                    throw new RuntimeException("Can't write into file", e);
                }
            } else {
                throw new FileMaxSizeReachedException("File max size: "
                        + fileLoggerConfiguration.getFileMaxSize()
                        +"\nFile current size: " + file.length()
                        +"\nFilePath: " + file.getAbsolutePath());
            }
        }
    }

    public void info(String message) throws FileMaxSizeReachedException {
        if (ifHasFreeSpace(file, fileLoggerConfiguration)) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                bufferedWriter.write("\n["+ LocalDateTime.now() +"] "
                        +"["+LoggingLevel.INFO.name()+"] "
                        + "Повідомлення: ["+message+"]");
            } catch (IOException e) {
                throw new RuntimeException("Can't write into file", e);
            }
        } else {
            throw new FileMaxSizeReachedException("File max size: "
                    + fileLoggerConfiguration.getFileMaxSize()
                    +"; File current size: " + file.length()
                    +"\nFilePath: " + file.getAbsolutePath());
        }
    }

    private boolean ifHasFreeSpace(File file, FileLoggerConfiguration fileLoggerConfiguration) {
        return file.length() < fileLoggerConfiguration.getFileMaxSize();
    }

    private boolean isDebugLogLevel(FileLoggerConfiguration fileLoggerConfiguration) {
        return fileLoggerConfiguration.getCurrentLogLevel().equals(LoggingLevel.DEBUG.name());
    }

    public String pathMorph(String path, String fileName) {
        String[] catalogs = path.split("/");
        StringJoiner stringJoiner = new StringJoiner("\\", "", "\\");
        for (String catalog : catalogs) {
            stringJoiner.add(catalog);
        }
        return stringJoiner + fileName;
    }
}
