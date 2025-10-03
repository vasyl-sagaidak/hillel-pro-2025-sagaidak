package org.example.lesson41homework;

import org.example.lesson41homework.config.SpringBootAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lesson41homeworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext
                = SpringApplication.run(Lesson41homeworkApplication.class, args);
    }

}
