package lesson_25_gof_patterns_02.livecoding_patterns.structural.composite;

import java.util.List;

/*
COMPOSITE (КОМПАНОВЩИК):
           -> Компонует обьекты в древовидную структуру, представляя их в виде иерархии.
              Позволяет клиенту одинаково обращаться как к отдельному обьекту, так и к
              целому поддереву.
 */

public class Composite_Pattern_Main {
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
