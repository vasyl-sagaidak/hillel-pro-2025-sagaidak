package org.example.lesson41homework.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class Order {
    private int id;
    private double totalCost;
    private LocalDate createdAt = LocalDate.now();
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getPrice();
    }
}

//Order