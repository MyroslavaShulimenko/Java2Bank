package com.example.bankproject.controller;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth/clients")
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/{id}")
    public Client getClientById (@PathVariable("id") BigInteger id){
        return clientService.getClientById(id);
    }
    @GetMapping("/find")
    public List<Client> findAllClient (){
        return clientService.findAllClient();
    }

    @PutMapping("/add")
    public ClientDto addClient(@RequestBody ClientDto clientDto){
        return clientService.createClient(clientDto);
    }
    @PutMapping("/create")
    public Client createClient(@RequestBody Client client){
        return clientService.createdClient(client);
    }

}
