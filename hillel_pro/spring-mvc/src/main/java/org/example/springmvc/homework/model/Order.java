package org.example.springmvc.homework.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private int id;
    private LocalDate creationDate = LocalDate.now();
    private double totalCost;
    private List<Product> products;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getCost();
    }
}
