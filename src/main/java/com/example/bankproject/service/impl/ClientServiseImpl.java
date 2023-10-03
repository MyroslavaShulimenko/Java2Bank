package com.example.bankproject.service.impl;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.entity.Client;
import com.example.bankproject.repository.ClientRepository;
import com.example.bankproject.service.ClientServise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ClientServiseImpl implements ClientServise {
    private final ClientRepository clientRepository;
    @Override
    public Client getClientById(BigInteger id) {
        return clientRepository.getClientById(id);
    }

    @Override
    public List<Client>  findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(ClientDto client) {
//        Client client = clientMapper.mapToEntity(clientDto);
//        client.setManager(manager);
        return clientRepository.save(client);
    }
}
