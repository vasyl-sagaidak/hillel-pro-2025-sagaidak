package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Switch {
    private Map<String, Command> history = new HashMap<>();

    public void executeAndStore(String code, Command command) {
        history.put(code, command);
         command.execute();
    }

    public Map<String, Command> getHistory() {
        return history;
    }
}
