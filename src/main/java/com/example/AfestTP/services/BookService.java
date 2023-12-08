package com.example.AfestTP.services;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.models.Book;
import com.example.AfestTP.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getByAuthor(Author author){
        return author.getBooks();
    }

    public Optional<Book> getById(Long id){
     return bookRepository.findById(id);
    }

    public void delete(Book book){
        book.getAvailable();
    }



    // lister/trouver/filtrer/ajouter/updta/suppr
    // disponible ?
}
