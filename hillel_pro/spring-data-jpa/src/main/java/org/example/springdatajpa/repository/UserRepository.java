package org.example.springdatajpa.repository;

import org.example.springdatajpa.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM users AS s", nativeQuery = true)
    List<User> getUsers();

    User getUserByNameAndEmail(String name, String email);

}
