package com.example.AfestTP.controllers;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public Iterable<Author> getAuthors() {return authorService.getAuthors();}
}
