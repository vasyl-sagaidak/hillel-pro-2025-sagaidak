package lesson_17_Stream_API.lms_bonustask;

import java.util.List;

public class ProductProcessor {
    public double calculateTotalPrice(List<Product> products) {
        return products.isEmpty() ?
                0.0 : products.stream()
                .filter(p -> p.getPrice() > 0)
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
