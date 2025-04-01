package lesson_25_gof_patterns_02.livecoding_patterns.structural.decorator;

public class TomatoDecorator extends PizzaDecorator{

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", tomatoes";
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }
}
