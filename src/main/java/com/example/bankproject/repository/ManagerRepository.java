package com.example.bankproject.repository;

import com.example.bankproject.mapper.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface ManagerRepository extends JpaRepository<Manager, BigInteger> {
        Manager getManagerById(BigInteger id);

    void deleteById(BigInteger id);
}


