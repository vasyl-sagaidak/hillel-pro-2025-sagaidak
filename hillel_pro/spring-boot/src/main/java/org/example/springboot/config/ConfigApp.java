package org.example.springboot.config;

import org.example.springboot.service.OtherService;
import org.example.springboot.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    public StudentService studentService() {
        return new StudentService();
    }

    @Bean
    public OtherService otherService(StudentService studentService) {
        return new OtherService(studentService);
    }
}
