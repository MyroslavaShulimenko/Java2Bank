package com.example.bankproject.repository;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ClientRepository extends JpaRepository<Client, BigInteger> {


    Client getClientById(BigInteger id);
}

