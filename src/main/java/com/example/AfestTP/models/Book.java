package com.example.AfestTP.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long bookId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, name="book_type")
    private Enum<BookType> bookType;

    @ManyToOne (fetch = FetchType.LAZY)
    private Author author;

    @Column (nullable = false, name="nb_pages")
    private int nbPages;

    @Column (nullable = false, name="price")
    private double price;

    @Column (columnDefinition = "boolean default true")
    private Boolean available;

    @Override
    public String toString() {
        return author.getAuthorLastName();
    }
}
