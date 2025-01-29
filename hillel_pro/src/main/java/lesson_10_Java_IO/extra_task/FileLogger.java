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
    private final LocalDateTime ldt = LocalDateTime.now();
    private final FileLoggerConfiguration fc;
    private File file;

    public FileLogger(FileLoggerConfiguration fc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy_HH-mm");
        this.fc = fc;
        this.file = new File(pathMorph(LOGS_PATH, "Log_"+ldt.format(formatter)+fc.getRecordFormat()));
    }

    public void debug(String message) throws FileMaxSizeReachedException  {
        if (isDebugLogLevel(fc)) {
            if (ifHasFreeSpace(file,fc)) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                    bw.newLine();
                    bw.write("["+ldt+"] "+"["+LoggingLevel.DEBUG.name()+"] "
                            + "Повідомлення: ["+message+"]");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("File not found", e);
                } catch (IOException e) {
                    throw new RuntimeException("Can't write into file", e);
                }
            } else {
                throw new FileMaxSizeReachedException("File max size: " + fc.getFileMaxSize()
                        +"\nFile current size: " + file.length()
                        +"\nFilePath: " + file.getAbsolutePath());
            }
        }
    }

    public void info(String message) throws FileMaxSizeReachedException {
        if (ifHasFreeSpace(file, fc)) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write("\n["+ldt+"] "+"["+LoggingLevel.INFO.name()+"] "
                        + "Повідомлення: ["+message+"]");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new FileMaxSizeReachedException("File max size: " + fc.getFileMaxSize()
                    +"; File current size: " + file.length()
                    +"\nFilePath: " + file.getAbsolutePath());
        }
    }

    private boolean ifHasFreeSpace(File file, FileLoggerConfiguration fc) {
        return file.length() < fc.getFileMaxSize();
    }

    private boolean isDebugLogLevel(FileLoggerConfiguration fc) {
        return fc.getCurrentLogLevel().equals(LoggingLevel.DEBUG.name());
    }

    public String pathMorph(String path, String fileName) {
        String[] paths = path.split("/");
        StringJoiner sj = new StringJoiner("\\", "", "\\");
        for (String e : paths) {
            sj.add(e);
        }
        return sj + fileName;
    }
}
