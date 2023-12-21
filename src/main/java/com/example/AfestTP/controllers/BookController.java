package com.example.AfestTP.controllers;

import com.example.AfestTP.models.Book;
import com.example.AfestTP.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {
List<String> myList = new ArrayList();
    @Autowired
    private BookService bookService;

    @GetMapping()
    @ResponseBody
    List<Book> getBooks() {return this.bookService.getAll();}

    @GetMapping(value = "/{id}")
    @ResponseBody
    Book getBook(@PathVariable Long id){return this.bookService.getById(id);}

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    void createBook(@RequestBody Book book) {this.bookService.create(book);}

    @PutMapping()
    @ResponseBody
    void update(@RequestBody Book book) {this.bookService.update(book);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteBook(@PathVariable Long id){this.bookService.delete(id);}
    }
