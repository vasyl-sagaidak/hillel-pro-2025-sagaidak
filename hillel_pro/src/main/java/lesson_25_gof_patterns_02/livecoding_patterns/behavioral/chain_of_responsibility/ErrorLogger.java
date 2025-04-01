package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.chain_of_responsibility;

public class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
