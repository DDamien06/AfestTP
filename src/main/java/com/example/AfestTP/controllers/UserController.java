package com.example.AfestTP.controllers;

import com.example.AfestTP.dto.UserRequest;
import com.example.AfestTP.models.Users;
import com.example.AfestTP.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    List<Users> getUsers() {
        return this.userService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    Users getUser(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    // @GetMapping(value = "/{name}")
    // @ResponseBody
    //Users getUserByName(@PathVariable String name) {return this.userService.getByName(name);}

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    void createUser(@RequestBody Users user) throws NoSuchAlgorithmException {
        this.userService.create(user);
    }

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    String toLogin(@RequestBody UserRequest userRequest) throws NoSuchAlgorithmException {
        return this.userService.toLogin(userRequest.getUsername(), userRequest.getPassword());
    }


}
