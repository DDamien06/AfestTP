package com.example.AfestTP.services;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.models.Client;
import com.example.AfestTP.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Iterable<Author> getAuthors(){
        return authorRepository.findAll();
    }

}
