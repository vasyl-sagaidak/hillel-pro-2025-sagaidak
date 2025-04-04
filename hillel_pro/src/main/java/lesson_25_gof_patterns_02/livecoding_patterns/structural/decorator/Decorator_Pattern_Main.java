package lesson_25_gof_patterns_02.livecoding_patterns.structural.decorator;

/*
DECORATOR (ДЕКОРАТОР):
           -> Динамически предоставляет обьекту дополнительные возможности. Представляет
              собой гибкую альтернативу наследованию для расширения функциональности.
 */

public class Decorator_Pattern_Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Plain pizza" + pizza.getDescription() + " cost " + pizza.getCost());

        Pizza cheese = new CheeseDecorator(pizza);
        System.out.println("Cheese pizza " + cheese.getDescription() + " cost " + cheese.getCost());

        Pizza tomato = new TomatoDecorator(pizza);
        System.out.println("Tomato pizza " + tomato.getDescription() + " cost " + tomato.getCost());
    }
}
