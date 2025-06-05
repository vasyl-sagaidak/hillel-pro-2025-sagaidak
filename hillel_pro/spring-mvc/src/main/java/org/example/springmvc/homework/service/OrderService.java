package org.example.springmvc.homework.service;

import lombok.AllArgsConstructor;
import org.example.springmvc.homework.dao.OrderRepository;
import org.example.springmvc.homework.exception.OrderNotFoundException;
import org.example.springmvc.homework.model.Order;
import org.springframework.stereotype.Service;

import java.util.Map;

@AllArgsConstructor
@Service
public class OrderService {

    private OrderRepository orderRepository;

    public Order getById(int id) {
        Order order = orderRepository.getById(id);
        if (order == null) {
            throw new OrderNotFoundException(String
                    .format("Order with id %s does not exist.", id));
        }
        return order;
    }

    public Map<Integer, Order> getAll() {
        return orderRepository.getAll();
    }

    public void addOrder(Order order) {
        orderRepository.add(order);
    }
}
