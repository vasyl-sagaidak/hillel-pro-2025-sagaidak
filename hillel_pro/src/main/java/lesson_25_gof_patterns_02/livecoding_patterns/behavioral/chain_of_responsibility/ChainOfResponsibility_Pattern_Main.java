package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.chain_of_responsibility;

/*
CHAIN OF RESPONSIBILITY (ЦЕПОЧКА ОБЯЗАННОСТЕЙ):
        -> Избегает связывания отправителя запроса с его получателем, давая возможность
           обработать запрос более чем одному обьекту. Связывает обьекты получатели и
           передает запрос по цепочке пока обьект не обработает его.
 */

public class ChainOfResponsibility_Pattern_Main {
    public static void main(String[] args) {
    ChainOfLoggers chainOfLoggers = new ChainOfLoggers();
        Logger logger = chainOfLoggers.getLogger();

        logger.logMessage(Logger.INFO, "this is info message");
        logger.logMessage(Logger.DEBUG, "this is debug message");
        logger.logMessage(Logger.ERROR, "this is error message");
    }
}
