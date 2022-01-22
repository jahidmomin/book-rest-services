package com.example.exceptionhandlingdemo.service;

import com.example.exceptionhandlingdemo.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    boolean save(Book book);

    Book getBookBybookId(long bookId);
}
