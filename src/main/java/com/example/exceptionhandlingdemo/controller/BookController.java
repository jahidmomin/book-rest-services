package com.example.exceptionhandlingdemo.controller;

import com.example.exceptionhandlingdemo.model.Book;
import com.example.exceptionhandlingdemo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable long bookId) {
        return this.bookService.getBookBybookId(bookId);
    }

    @PostMapping("/")
    public boolean getAllBooks(@RequestBody Book book) {
        return this.bookService.save(book);
    }
}
