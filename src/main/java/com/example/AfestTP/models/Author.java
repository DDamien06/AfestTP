package com.example.AfestTP.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table (name="authors")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long authorId;

    @Column( nullable = false,name="first_name")
    private String authorFirstName;

    @Column( nullable = false,name="last_name")
    private String authorLastName;


    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Book> books;

    public Author(){}

    public Author(Long id, String authorFirstName, String authorLastName) {
        this.authorId=id;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString() {
        return authorLastName;
    }
}
