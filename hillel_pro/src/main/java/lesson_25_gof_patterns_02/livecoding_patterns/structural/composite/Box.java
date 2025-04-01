package lesson_25_gof_patterns_02.livecoding_patterns.structural.composite;

import java.util.List;

public class Box implements Element {
    private final List<Product> products;

    public Box(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getPrice() {
        return products.stream()
                .map(Product::getPrice)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
