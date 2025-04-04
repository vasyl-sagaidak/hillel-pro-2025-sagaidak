package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.command;

public class FlipUpCommand implements Command{
    private Electricity light;

    public FlipUpCommand(Electricity light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
