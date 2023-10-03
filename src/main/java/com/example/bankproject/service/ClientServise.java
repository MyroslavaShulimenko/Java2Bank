package com.example.bankproject.service;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.entity.Client;

import java.math.BigInteger;
import java.util.List;

public interface ClientServise {
   Client getClientById(BigInteger id);

   List<Client> findAllClient();

    ClientDto createClient(ClientDto client);
}

