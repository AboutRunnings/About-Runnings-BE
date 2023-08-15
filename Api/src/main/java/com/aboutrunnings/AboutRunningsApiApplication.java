package com.aboutrunnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class AboutRunningsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AboutRunningsApiApplication.class, args);
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
    }
}
