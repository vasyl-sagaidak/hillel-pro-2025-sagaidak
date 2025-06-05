package org.example.springmvc.homework.controller;

import lombok.AllArgsConstructor;
import org.example.springmvc.homework.model.Order;
import org.example.springmvc.homework.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {

    private OrderService service;

    @PostMapping(value = "/add")
    public void addOrder(@RequestBody Order order) {
        service.addOrder(order);
    }

    @GetMapping(value = "/getAll")
    public Map<Integer, Order> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    public Order getOrderByIdParam(@PathVariable int id) {
        return service.getById(id);
    }

    @GetMapping(value = "/getByIdRequest")
    public Order getOrderByIdRequest(int id) {
        return service.getById(id);
    }
}
