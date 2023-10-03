package com.example.bankproject.controller;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.entity.Account;
import com.example.bankproject.entity.Client;
import com.example.bankproject.service.ClientServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth/clients")
public class ClientController {
    private final ClientServise clientServise;
    @GetMapping("/{id}")
    public Client getClientById (@PathVariable("id") BigInteger id){
        return clientServise.getClientById(id);
    }
    @GetMapping("/find")
    public List<Client> findAllClient (){
        return clientServise.findAllClient();
    }

    @PostMapping("/add")
    public Client addClient(@RequestBody ClientDto clientDto){
        return clientServise.createClient(clientDto);
    }
}
