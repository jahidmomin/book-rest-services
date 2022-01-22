package com.example.exceptionhandlingdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "book")
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    private double price;
}
