package lesson_24_gof_patterns_01.homework;

public class LoggerRunner {
    public static void main(String[] args) {
        Logger testLogger = Logger.getInstance();
        Logger testLogger2 = Logger.getInstance();
        Logger testLogger3 = Logger.getInstance();
        testLogger.log("Are loggers equals: " + (testLogger == testLogger2));
        testLogger2.log(" --- ");
        testLogger.log("Logger I hashCode: " + testLogger.hashCode());
        testLogger2.log("Logger II hashCode: " + testLogger2.hashCode());
        testLogger3.log("Logger III hashCode: " + testLogger3.hashCode());
        testLogger3.log(" --- ");

        for (int i= 0, j= 0; i < 4; i++, j+=2) {
            testLogger.log(i + " octopus - logger I");
            testLogger2.log(j + " hippopotamus - logger II");
            testLogger3.log(i + " zebra - logger III on the run");
        }
    }
}
