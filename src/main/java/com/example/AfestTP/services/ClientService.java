package com.example.AfestTP.services;

import com.example.AfestTP.exceptions.UnknownResourceException;
import com.example.AfestTP.models.Client;
import com.example.AfestTP.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getById(Long id) {
        return clientRepository.findById(id).orElseThrow(UnknownResourceException::new);
    }

    public Client create(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Client client) {
        Client existingClient = clientRepository.findById(client.getClientId()).orElseThrow(UnknownResourceException::new);
        return clientRepository.save(existingClient);
    }

    public void delete(Long id) {
        Client client = clientRepository.findById(id).orElseThrow(UnknownResourceException::new);
        clientRepository.delete(client);
    }
}
