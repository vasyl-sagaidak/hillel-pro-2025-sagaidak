package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.chain_of_responsibility;

public class InfoLogger extends Logger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO " + message);
    }
}
