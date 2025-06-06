package org.example.springboot;

import org.example.springboot.config.ConfigApp;
import org.example.springboot.model.Student;
import org.example.springboot.service.OtherService;
import org.example.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootApplication.class, args);

        StudentService studentService = applicationContext.getBean(StudentService.class);
        studentService.addStudent(new Student(1, "Bob"));

        OtherService otherService = applicationContext.getBean(OtherService.class);
        otherService.printAllStudents();

        ConfigApp configApp = applicationContext.getBean(ConfigApp.class);
        System.out.println(configApp.getAppName());
    }

}
