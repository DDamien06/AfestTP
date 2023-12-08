package com.example.AfestTP.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "title", nullable = false)
    private String Title;

    private Enum<BookType> bookType;

    @ManyToOne (fetch = FetchType.LAZY)
    private Author author;

    private int nbPages;

    private double price;

    @Column (columnDefinition = "boolean default true")
    private Boolean available;
}
