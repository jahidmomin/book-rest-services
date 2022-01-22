package com.example.exceptionhandlingdemo.controller;

import com.example.exceptionhandlingdemo.exceptions.BookNotFoundException;
import com.example.exceptionhandlingdemo.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = BookNotFoundException.class)
    public ResponseEntity<?> handleNoBookFoundException() {

        //create a response
        ApiError apiError = new ApiError(404, "Book Not Exist", new Date());

        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
