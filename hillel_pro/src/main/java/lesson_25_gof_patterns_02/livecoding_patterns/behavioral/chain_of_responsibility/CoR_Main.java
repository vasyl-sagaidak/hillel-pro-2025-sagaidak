package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.chain_of_responsibility;

public class CoR_Main {
    public static void main(String[] args) {
    ChainOfLoggers chainOfLoggers = new ChainOfLoggers();
        Logger logger = chainOfLoggers.getLogger();

        logger.logMessage(Logger.INFO, "this is info message");
        logger.logMessage(Logger.DEBUG, "this is debug message");
        logger.logMessage(Logger.ERROR, "this is error message");
    }
}
