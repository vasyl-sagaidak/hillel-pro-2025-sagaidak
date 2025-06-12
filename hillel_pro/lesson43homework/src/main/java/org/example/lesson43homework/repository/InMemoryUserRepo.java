package org.example.lesson43homework.repository;

import org.example.lesson43homework.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepo {

    private Map<Integer,User> users = new HashMap<>();

    {
        users.put(1, new User(1, "tom", "1111"));
        users.put(2, new User(2, "alice", "2222"));
        users.put(3, new User(3, "bob", "3333"));
    }

    public Map<Integer, User> getAll() {
        return new HashMap<>(users);
    }

    public User getUserById(int id) {
        return users.get(id);
    }

    public void put(User user) {
        users.put(user.getId(), user);
    }

    public void delete(User user) {
        users.remove(user.getId());
    }
}
