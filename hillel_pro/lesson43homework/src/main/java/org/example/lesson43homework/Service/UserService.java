package org.example.lesson43homework.Service;

import org.example.lesson43homework.model.User;
import org.example.lesson43homework.repository.InMemoryUserRepo;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {

    private InMemoryUserRepo userRepo;

    public UserService(InMemoryUserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userRepo.getAll().values());
    }

    public User getById(int id) {
        return userRepo.getUserById(id);
    }
}
