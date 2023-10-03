package com.example.bankproject.service.impl;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.ClientMapper;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.repository.ClientRepository;
import com.example.bankproject.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
//@RequiredArgsConstructor

public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }
    public Client getClientById(BigInteger id) {
        return clientRepository.getClientById(id);
    }

    @Override
    public List<Client>  findAllClient() {
        return clientRepository.findAll();
    }

    @Override
   @Transactional
    public ClientDto createClient(ClientDto client) {
        return clientMapper.mapToDto(clientRepository.save(client));
    }
}
