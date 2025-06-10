package org.example.lesson41homework.controller;

import org.example.lesson41homework.model.Order;
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
public class OrderController {

    @GetMapping(value = "/get")
    public Order getOrderByIdRequest(@RequestParam int id) {
        throw new RuntimeException();
    }

    @GetMapping(value = "/get/{id}")
    public Order getOrderByIdPath(@PathVariable int id) {
        throw new RuntimeException();
    }

    @GetMapping(value = "/getAll")
    public List<Order> getAll() {
        throw new RuntimeException();
    }

    @PostMapping(value = "/add")
    public void addProduct(@RequestBody Order order) {

    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteProductByPath(@PathVariable int id) {

    }

    @DeleteMapping(value = "/delete")
    public void deleteProductByRequest(@RequestParam int id) {

    }

    @PutMapping(value = "/update")
    public void updateOrder(@RequestBody Order order) {

    }


}
