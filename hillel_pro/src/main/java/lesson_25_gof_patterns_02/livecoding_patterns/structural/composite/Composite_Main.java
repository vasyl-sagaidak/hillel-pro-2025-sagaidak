package lesson_25_gof_patterns_02.livecoding_patterns.structural.composite;

import java.util.List;

public class Composite_Main {
    public static void main(String[] args) {
        CompositeElement compositeElement = new CompositeElement(
                new Box(List.of(new Product(12), new Product(25))),
                new Product(232),
                new Box(List.of(new Product(120)))
        );
        int price = compositeElement.getPrice();
        System.out.println(price);
    }
}
