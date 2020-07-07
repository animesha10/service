package com.simple.service.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simple.service")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
