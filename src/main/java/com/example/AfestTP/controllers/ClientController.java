package com.example.AfestTP.controllers;

import com.example.AfestTP.models.Client;
import com.example.AfestTP.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public Iterable<Client> getClients(){
        return clientService.getClients();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Client getClient(Client client){return client;}
}
