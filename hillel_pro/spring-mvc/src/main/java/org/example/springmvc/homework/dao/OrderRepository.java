package org.example.springmvc.homework.dao;

import org.example.springmvc.homework.model.Order;
import org.example.springmvc.homework.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {
    private final Map<Integer, Order> orderRepository = new HashMap<>();

    {
        Order order = new Order(1);
        order.addProduct(new Product(1, "Milk", 3.25));
        order.addProduct(new Product(2, "Chocolate", 1.35));
        order.addProduct(new Product(3, "Bananas", 3.80));
        orderRepository.put(order.getId(), order);

        Order orderTwo = new Order(2);
        orderTwo.addProduct(new Product(1, "Pants", 45.0));
        orderTwo.addProduct(new Product(2, "T-Shirt", 35.0));
        orderRepository.put(orderTwo.getId(), orderTwo);
    }

    public Order getById(int id) {
        return orderRepository.get(id);
    }

    public Map<Integer, Order> getAll() {
        return new HashMap<>(orderRepository);
    }

    public void add(Order order) {
        double total = order.getProducts().stream().
                mapToDouble(Product::getCost).sum();
        order.setTotalCost(total);
        orderRepository.put(order.getId(), order);
    }
}
