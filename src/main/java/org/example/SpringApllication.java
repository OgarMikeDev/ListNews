package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SpringApllication {
    public static void main(String[] args) {
        System.out.println("This write Mike");
        SpringApplication.run(SpringApllication.class,args);
    }
}
