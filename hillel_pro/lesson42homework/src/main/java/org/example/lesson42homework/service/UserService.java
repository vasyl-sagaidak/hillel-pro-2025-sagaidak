package org.example.lesson42homework.service;

import lombok.RequiredArgsConstructor;
import org.example.lesson42homework.dto.Post;
import org.example.lesson42homework.dto.User;
import org.example.lesson42homework.repository.PostRepository;
import org.example.lesson42homework.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Transactional
  public User createUserWithPosts(User user, List<Post> posts) {
      userRepository.save(user);

      for (Post post : posts) {
          post.setUser(user);
          postRepository.save(post);
      }

//      // Test
//      if (true) {
//          throw new RuntimeException("Test rollback");
//      }

      return user;
  }

  public List<User> findByName(String name) {
      return userRepository.findByName(name);
  }

  public List<User> findByEmailDomain(String domain) {
      return userRepository.findByEmailDomain(domain);
  }

  public List<Post> getPostsByUserId(Integer userId) {
      return postRepository.findAllByUserId(userId);
  }
    
}
