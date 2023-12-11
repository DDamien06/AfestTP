package com.example.AfestTP.controllers;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    @ResponseBody
    List<Author> getAuthors() {return this.authorService.getAll();}

    @GetMapping(value = "/{authorId}")
    @ResponseBody
    Author getAuthor(@PathVariable Long authorId) {return this.authorService.getById(authorId);}

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    void createAuthor(@RequestBody Author author) {this.authorService.create(author);}

    @PutMapping()
    @ResponseBody
    void update(@RequestBody Author author) {this.authorService.update(author);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteAuthor(@PathVariable Long id){this.authorService.delete(id);}

}
