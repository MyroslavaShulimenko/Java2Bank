package com.example.bankproject.repository;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, BigInteger> {
    Client getClientById(BigInteger id);

    Client save(ClientDto client);

    //  List<Client> findAllClient();
}

