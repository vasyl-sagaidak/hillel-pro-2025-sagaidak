package org.example.lesson41homework.controller;

import lombok.RequiredArgsConstructor;
import org.example.lesson41homework.model.Order;
import org.example.lesson41homework.service.OrderService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value = "/get")
    public Order getOrderByIdRequest(@RequestParam int id) {
        return orderService.getOrderById(id);
    }

    @GetMapping(value = "/get/{id}")
    public Order getOrderByIdPath(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @GetMapping(value = "/getAll")
    public List<Order> getAll() {
        return orderService.getAllOrders();
    }

    @PostMapping(value = "/add")
    public void addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteOrderByPath(@PathVariable int id) {
        orderService.deleteOrder(id);
    }

    @DeleteMapping(value = "/delete")
    public void deleteOrderByRequest(@RequestParam int id) {
        orderService.deleteOrder(id);
    }

    @PutMapping(value = "/update")
    public void updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
    }

}

// OrderController
