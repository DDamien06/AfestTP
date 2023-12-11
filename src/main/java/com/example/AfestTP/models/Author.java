package com.example.AfestTP.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name="authors")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column( nullable = false,name="first_name")
    private String authorFirstName;

    @Column( nullable = false,name="last_name")
    private String authorLastName;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author(){}
    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

}
