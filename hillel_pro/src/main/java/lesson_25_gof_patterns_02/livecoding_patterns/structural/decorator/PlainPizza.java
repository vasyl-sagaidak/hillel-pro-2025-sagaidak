package lesson_25_gof_patterns_02.livecoding_patterns.structural.decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
