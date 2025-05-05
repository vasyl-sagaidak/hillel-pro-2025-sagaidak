package lesson_32_Logging_and_Debug.classwork;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransactionService {
    private static final Logger LOGGER = LogManager.getLogger(TransactionService.class);

    public void createTransaction(int amount) {
        LOGGER.info("Creating transaction with amount {}", amount);
    }
}
