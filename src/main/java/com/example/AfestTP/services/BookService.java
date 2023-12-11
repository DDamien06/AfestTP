package com.example.AfestTP.services;

import com.example.AfestTP.exceptions.UnknowResourceException;
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

    public List<Book> getAll(){return bookRepository.findAll();}

    public List<Book> getByAuthor(Author author){
        return author.getBooks();
    }

    public Book getById(Long id){
     return bookRepository.findById(id).orElseThrow(UnknowResourceException::new);
    }

    public Book create(Book book){
        return bookRepository.save(book);
    }

    public Book update(Book book){
        Book existingBook = bookRepository.findById(book.getBookId()).orElseThrow(UnknowResourceException::new);
        return  bookRepository.save(existingBook);
    }
    public void delete(Long id){
        Book book = bookRepository.findById(id).orElseThrow(UnknowResourceException::new);
        if (isAvailable(book)){
            bookRepository.delete(book);
        };
    }

    public  boolean isAvailable(Book book){
        return book.getAvailable();
    }
}
