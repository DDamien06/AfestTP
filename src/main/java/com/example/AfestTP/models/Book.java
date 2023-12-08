package com.example.AfestTP.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private Enum<BookType> bookType;

    @ManyToOne
    private Author author;

    private int nbPages;

    private double price;

    private boolean available=true;
}
