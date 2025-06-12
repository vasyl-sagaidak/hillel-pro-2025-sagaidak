package org.example.lesson43homework.controller;

import org.example.lesson43homework.Service.UserService;
import org.example.lesson43homework.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/admin/getAll")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getById(id);
    }

    @GetMapping (value = "/user")
    public String userAuthorized() {
        return "User has been successfully authorized";
    }

    @GetMapping (value = "/admin")
    public String adminAuthorized() {
        return "Admin has been successfully authorized";
    }
}
