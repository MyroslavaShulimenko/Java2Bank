package com.example.bankproject.repository;

import com.example.bankproject.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AccountRepository extends JpaRepository<Account,BigInteger> {
    Account getAccountById(BigInteger id);
}
