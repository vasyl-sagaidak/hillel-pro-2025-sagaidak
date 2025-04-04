package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.command;

public class FlipDownCommand implements Command{
    private Electricity light;

    public FlipDownCommand(Electricity light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
