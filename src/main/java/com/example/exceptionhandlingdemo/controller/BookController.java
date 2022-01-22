package com.example.exceptionhandlingdemo.controller;

import com.example.exceptionhandlingdemo.model.Book;
import com.example.exceptionhandlingdemo.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @PostMapping("/")
    public boolean getAllBooks(@RequestBody Book book) {
        return this.bookService.save(book);
    }
}
