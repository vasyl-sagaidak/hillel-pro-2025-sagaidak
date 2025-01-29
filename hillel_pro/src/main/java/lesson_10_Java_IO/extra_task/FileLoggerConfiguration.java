package lesson_10_Java_IO.extra_task;

public class FileLoggerConfiguration {
    private final String sourceConfigFilePath;
    private final String currentLogLevel;
    private final Long fileMaxSize;
    private final String recordFormat;

    public FileLoggerConfiguration(String sourceFilePath, String currentLogLevel,
                                   Long fileMaxSize, String recordFormat) {
        this.sourceConfigFilePath = sourceFilePath;
        this.currentLogLevel = currentLogLevel;
        this.fileMaxSize = fileMaxSize;
        this.recordFormat = recordFormat;
    }

    public Long getFileMaxSize() {
        return fileMaxSize;
    }

    public String getSourceConfigFilePath() {
        return sourceConfigFilePath;
    }

    public String getCurrentLogLevel() {
        return currentLogLevel;
    }

    public String getRecordFormat() {
        return recordFormat;
    }
}
