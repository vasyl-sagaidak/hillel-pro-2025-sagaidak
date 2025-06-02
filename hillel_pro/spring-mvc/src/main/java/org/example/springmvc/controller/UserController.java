package org.example.springmvc.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.springmvc.model.User;
import org.example.springmvc.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping(value = "/getAll")
    public Map<Integer, User> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/getByIdRequest")
    public User getByIdRequest(@RequestParam int id) {
        return userService.getById(id);
    }

    @GetMapping(value = "/getByIdParam/{id}")
    public User getByIdParam(@PathVariable int id) {
        return userService.getById(id);
    }
}
