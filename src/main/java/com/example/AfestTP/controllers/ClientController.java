package com.example.AfestTP.controllers;

import com.example.AfestTP.models.Client;
import com.example.AfestTP.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    @ResponseBody
    public List<Client> getClients(){
        return clientService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseBody
    public Client getClient(@PathVariable Long id){return this.clientService.getById(id);}

   @PostMapping()
   @ResponseStatus(HttpStatus.OK)
    void createClient(@RequestBody Client client) {this.clientService.create(client);}

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    void update(@RequestBody Client client){this.clientService.update(client);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteClient(@PathVariable Long id){this.clientService.delete(id);}


}
