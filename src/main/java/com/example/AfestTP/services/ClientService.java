package com.example.AfestTP.services;

import com.example.AfestTP.models.Client;
import com.example.AfestTP.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

// lister/trouver/filtrer/ajouter/updta/suppr
    //louer/rendre un livre
}
