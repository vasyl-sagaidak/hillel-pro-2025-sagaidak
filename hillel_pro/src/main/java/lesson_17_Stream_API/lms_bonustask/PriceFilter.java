package lesson_17_Stream_API.lms_bonustask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PriceFilter implements ProductFilter {
    private double maxPrice;

    public PriceFilter(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Product> filter(List<Product> products) {
            return products.stream()
                    .filter(n -> n.getPrice() < maxPrice)
                    .collect(Collectors.toList());
    }
}
