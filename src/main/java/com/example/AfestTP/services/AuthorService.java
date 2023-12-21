package com.example.AfestTP.services;

import com.example.AfestTP.exceptions.UnknownResourceException;
import com.example.AfestTP.models.Author;
import com.example.AfestTP.models.Book;
import com.example.AfestTP.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author getById(Long id) {
        return authorRepository.findById(id).orElseThrow(UnknownResourceException::new);
    }

    public Author create(Author author) {
        return authorRepository.save(author);
    }

    public Author update(Author author) {
        Author existingAuthor = authorRepository.findById(author.getAuthorId()).orElseThrow(UnknownResourceException::new);
        return authorRepository.save(existingAuthor);
    }

    public void addBook(Long authorId, Book book) {
        Author author = authorRepository.findById(authorId).orElseThrow(UnknownResourceException::new);
        author.getBooks().add(book);
    }

    public void delete(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(UnknownResourceException::new);
        if (isAllowToDelete(author)) {
            authorRepository.delete(author);
        }

    }

    public boolean isAllowToDelete(Author author) {
        boolean isAllow = true;
        for (Book book : author.getBooks()) {
            if (!book.getAvailable()) {
                isAllow = false;
                break;
            }
        }
        return isAllow;
    }


}
