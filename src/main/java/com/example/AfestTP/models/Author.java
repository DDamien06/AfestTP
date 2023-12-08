package com.example.AfestTP.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    private String authorFirstName;

    private String authorLastName;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
