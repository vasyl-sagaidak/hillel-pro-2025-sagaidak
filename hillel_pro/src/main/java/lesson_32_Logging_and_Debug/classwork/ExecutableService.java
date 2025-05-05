package lesson_32_Logging_and_Debug.classwork;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.ThreadContext;


import java.util.UUID;

@AllArgsConstructor
public class ExecutableService {
    private TransactionService transactionService;

    public void execute(int amount, UUID uuid) {
        // MDC in log4j2 renamed to ThreadContext...
        ThreadContext.put("transaction.uuid", String.valueOf(uuid));
        transactionService.createTransaction(amount);
    }

    public static void main(String[] args) {
        ExecutableService executableService = new ExecutableService(new TransactionService());
        for (int i = 0; i < 10; i++) {
            executableService.execute(i+1,UUID.randomUUID());
        }
    }
}
