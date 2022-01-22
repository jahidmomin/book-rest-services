package com.example.exceptionhandlingdemo.repo;

import com.example.exceptionhandlingdemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
