package com.example.bankproject.repository;

import com.example.bankproject.entity.Account;
import com.example.bankproject.entity.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AgreementRepository extends JpaRepository<Agreement, BigInteger> {
    Agreement getAgreementById(BigInteger id);

}
