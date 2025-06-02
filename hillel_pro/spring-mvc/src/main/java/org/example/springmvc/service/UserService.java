package org.example.springmvc.service;

import org.example.springmvc.exception.UserNotFoundException;
import org.example.springmvc.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public Map<Integer, User> getAllUsers() {
        return users;
    }
//
//    public User getById(Integer id) {
//        return users.get(id);
//    }

    public User getById(Integer id) {
       User user = users.get(id);
       if (user == null) {
           throw new UserNotFoundException(String.format("User with id %s not found", id));
       }
       return user;
    }
}
