package com.example.springproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Controller"})
public class SpringProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringProject1Application.class, args);
    }

}
