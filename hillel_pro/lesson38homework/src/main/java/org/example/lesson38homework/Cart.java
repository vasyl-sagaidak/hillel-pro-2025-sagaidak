package org.example.lesson38homework;

import org.example.lesson38homework.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> basket = new ArrayList<>();

    public void addProduct(Product product) {
        basket.add(product);
    }

    public void removeById(int id) {
        basket.removeIf(p -> p.getId() == id);
    }

    public List<Product> getProductsBasket() {
        return new ArrayList<>(basket);
    }

    public double getTotalPrice() {
        return basket.stream().mapToDouble(Product::getPrice).sum();
    }
}
