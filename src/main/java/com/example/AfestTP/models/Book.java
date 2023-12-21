package com.example.AfestTP.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(nullable = false)
    private String title;

    @Column(name="book_type")
    @Enumerated(EnumType.ORDINAL)
    private BookType bookType;

    @ManyToOne (fetch = FetchType.LAZY)
    @JsonBackReference
    private Author author;

    @Column (nullable = false, name="nb_pages")
    private int nbPages;

    @Column (nullable = false, name="price")
    private double price;

    @Column (columnDefinition = "boolean default true")
    private Boolean available;

}
