package com.example.exceptionhandlingdemo;

import com.example.exceptionhandlingdemo.model.Book;
import com.example.exceptionhandlingdemo.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionhandlingdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionhandlingdemoApplication.class, args);
    }

}
