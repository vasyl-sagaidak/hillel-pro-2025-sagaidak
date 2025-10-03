package org.example.springsecurity.service;


import org.example.springsecurity.dto.UserDto;
import org.example.springsecurity.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
