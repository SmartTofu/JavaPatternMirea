package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        Environment environment = context.getEnvironment();

        System.out.println("Student Name: " + environment.getProperty("student.name"));
        System.out.println("Student Last Name: " + environment.getProperty("student.last_name"));
        System.out.println("Student Group: " + environment.getProperty("student.group"));
    }
}