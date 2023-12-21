package com.example.AfestTP.services;

import com.example.AfestTP.exceptions.UnknownResourceException;
import com.example.AfestTP.models.Users;
import com.example.AfestTP.repositories.UserRepository;
import com.example.AfestTP.tools.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private Encoder encoder = new Encoder();

    public List<Users> getAll() {
        return userRepository.findAll();
    }

    public Users getById(Long id) {
        return userRepository.findById(id).orElseThrow(UnknownResourceException::new);
    }

    public Users getByName(String name) {
        return userRepository.findByLogin(name);
    }

    public String toLogin(String userLogin, String userPassword) throws NoSuchAlgorithmException {
        String result;

        Users user = userRepository.findByLogin(userLogin);
        String savedPassword = user.getPassword();
        String inputPassword = encoder.hashPass(userPassword);

        if (inputPassword.equals(savedPassword)) {
            return "You are connected";
        }

        return "wrong password";
    }

    public Users findByLogin(String username) {
        return userRepository.findByLogin(username);
    }

    public Users create(Users user) throws NoSuchAlgorithmException {
        user.setPassword(encoder.hashPass(user.getPassword()));
        return userRepository.save(user);
    }

}
