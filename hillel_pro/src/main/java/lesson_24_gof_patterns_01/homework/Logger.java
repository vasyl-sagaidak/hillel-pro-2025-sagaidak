package lesson_24_gof_patterns_01.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Objects;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        final String path = "src/main/java/lesson_24_gof_patterns_01/homework/resource/";
        final String name = "logSingleton.txt";
        File file = new File(path + name);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            System.out.println("Log into a file: " + name + " - Successful!");
        } catch (Exception e) {
            throw new RuntimeException("File not found.", e);
        }
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public boolean equals(Object logger) {
        if (logger == this) {
            return true;
        }
        if (logger == null) {
            return false;
        }
        if (logger.getClass().equals(Logger.class)) {
            Logger current = (Logger) logger;
            return Objects.equals(current.instance,this.instance);
        }
        return false;
    }
}
