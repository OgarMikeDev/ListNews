package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplication {
    public static void main(String[] args) {
        System.out.println("This write Mike");
        org.springframework.boot.SpringApplication.run(SpringApplication.class,args);
    }
}
