package org.example.lesson42homework.controller;

import lombok.RequiredArgsConstructor;
import org.example.lesson42homework.dto.Post;
import org.example.lesson42homework.dto.User;
import org.example.lesson42homework.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUserWithPosts(user, user.getPosts()));
    }

    @GetMapping("/by-name")
    public List<User> getByName(@RequestParam String name) {
        return userService.findByName(name);
    }

    @GetMapping("/by-domain")
    public List<User> getByEmailDomain(@RequestParam String domain) {
        return userService.findByEmailDomain(domain);
    }

    @GetMapping("/{userId}/posts")
    public List<Post> getPosts(@PathVariable Integer userId) {
        return userService.getPostsByUserId(userId);
    }
}
