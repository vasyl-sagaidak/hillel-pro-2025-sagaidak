package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.chain_of_responsibility;

import lombok.extern.java.Log;

public class ChainOfLoggers {
    Logger infoLogger = new InfoLogger(Logger.INFO);
    Logger debugLogger = new DebugLogger(Logger.DEBUG);
    Logger errorLogger = new ErrorLogger(Logger.ERROR);

    public Logger getLogger() {
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
        return errorLogger;
    }
}
