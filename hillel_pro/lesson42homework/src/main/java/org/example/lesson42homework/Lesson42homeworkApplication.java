package org.example.lesson42homework;

import org.example.lesson42homework.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lesson42homeworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
                = SpringApplication.run(Lesson42homeworkApplication.class, args);
        UserRepository userRepository = applicationContext.getBean(UserRepository.class);

    }

}
