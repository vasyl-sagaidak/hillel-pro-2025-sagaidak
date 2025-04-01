package lesson_25_gof_patterns_02.livecoding_patterns.structural.decorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }
}
