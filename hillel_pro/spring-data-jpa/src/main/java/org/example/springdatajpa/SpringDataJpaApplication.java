package org.example.springdatajpa;

import org.example.springdatajpa.dto.Course;
import org.example.springdatajpa.dto.User;
import org.example.springdatajpa.repository.CourseRepository;
import org.example.springdatajpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
                = SpringApplication.run(SpringDataJpaApplication.class, args);

        UserRepository userRepository = applicationContext.getBean(UserRepository.class);
        CourseRepository courseRepository = applicationContext.getBean(CourseRepository.class);

        Course course = new Course();
        course.setName("JAVA PRO");

        courseRepository.save(course);

        User user = new User();
        user.setCourse(course);
        user.setName("Bob");
        user.setEmail("bob@alisson.com");

        userRepository.save(user);

        List<User> all = userRepository.findAll();
        System.out.println(all);
    }

}
