package com.example.AfestTP.controllers;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value="/authors", method = RequestMethod.GET)
    @ResponseBody
    List<Author> getAuthors() {return authorService.getAll();}

    @RequestMapping(value = "/authors/{authorId}",method = RequestMethod.GET)
    @ResponseBody
    Author getAuthor(@PathVariable final Long authorId) {return  authorService.getById(authorId);}

}
