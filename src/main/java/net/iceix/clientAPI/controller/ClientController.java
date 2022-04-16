package net.iceix.clientAPI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.iceix.clientAPI.model.Client;
import net.iceix.clientAPI.repository.ClientRepository;

import java.io.IOException;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    Iterable<Client> getClients() {
        return repository.findAll();
    }

    @GetMapping("/{leid}")
    Client getClientbyLeid(@PathVariable String leid) {
        return repository.findByLeid(leid);
    }


}