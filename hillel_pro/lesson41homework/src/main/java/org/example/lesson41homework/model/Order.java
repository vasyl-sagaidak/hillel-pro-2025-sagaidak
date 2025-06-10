package org.example.lesson41homework.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class Order {
    private int id;
    private double totalCost;
    private LocalDateTime createdAt = LocalDateTime.now();
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getPrice();
    }
}
