package com.cognizant.spring_learn; // ✅ fixed package name

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldRestfulApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldRestfulApplication.class, args);
    }
}
