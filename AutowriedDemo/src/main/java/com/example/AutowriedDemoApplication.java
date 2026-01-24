package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Student;

@SpringBootApplication
public class AutowriedDemoApplication implements CommandLineRunner {

    @Autowired
    private Student student;

    public static void main(String[] args) {
        SpringApplication.run(AutowriedDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        student.display();
    }
}
