package com.example.AfestTP.services;

import com.example.AfestTP.models.Client;
import com.example.AfestTP.repositories.ClientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Iterable<Client> getClients(){
        return clientRepository.findAll();
    }
}
