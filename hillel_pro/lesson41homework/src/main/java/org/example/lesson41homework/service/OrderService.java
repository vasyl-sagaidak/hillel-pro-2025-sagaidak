package org.example.lesson41homework.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.example.lesson41homework.model.Order;
import org.example.lesson41homework.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

//    public Order addOrder(Order order) {
//        return orderRepository.save(order);
//    }
//
//    public List<Order> getAllOrders() {
//        return orderRepository.findAll();
//    }
//
//    public Order getOrderById(int id) {
//        return orderRepository.findById(id)
//                .orElseThrow(
//                        () -> new EntityNotFoundException("Order not found"));
//    }
//
//    public void deleteOrder(int id) {
//        orderRepository.deleteById(id);
//    }
//
//    public Order updateOrder(Order order) {
//        if (!orderRepository.existsById(order.getId())) {
//            throw new EntityNotFoundException("Order not found");
//        }
//        return orderRepository.save(order);
//    }


}
