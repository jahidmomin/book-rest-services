package com.example.exceptionhandlingdemo.service.impl;

import com.example.exceptionhandlingdemo.model.Book;
import com.example.exceptionhandlingdemo.repo.BookRepo;
import com.example.exceptionhandlingdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.bookRepo.findAll();
    }

    @Override
    public boolean save(Book book) {
        this.bookRepo.save(book);
        return true;
    }
}
