package lesson_32_Logging_and_Debug.classwork;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            LOGGER.info("Test informational message!");
            LOGGER.debug("Message debug");
            throw new RuntimeException("Message was failed");
        } catch (Exception e) {
            LOGGER.error("Error Message", e);
        }
    }
}
