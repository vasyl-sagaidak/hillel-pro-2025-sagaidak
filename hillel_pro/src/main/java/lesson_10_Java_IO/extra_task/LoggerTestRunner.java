package lesson_10_Java_IO.extra_task;

import java.io.File;

public class LoggerTestRunner {
    private static final String FS = File.separator;
    private static final String RES_PATH = "src"+FS+"main"+FS+"java"+FS
            +"lesson_10_Java_IO"+FS+"extra_task" +FS+"resources"+FS;

    public static void main(String[] args) {
        File configFile = new File(RES_PATH + "configuration.txt");
        FileLoggerConfigurationLoader fileLoggerConfigurationLoader = new FileLoggerConfigurationLoader();
        FileLogger fileLogger = new FileLogger(fileLoggerConfigurationLoader.load(configFile));
            for (int i = 0; i < 100; i++) {
                if (i % 2 != 0) {
                    fileLogger.debug("This is DEBUG line in the log file.");
                }
                fileLogger.info("This is information line in the log file.");
            }
    }
}
