package org.example.lesson42homework.repository;

import org.example.lesson42homework.dto.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findAllByUserId(Integer id);
}
