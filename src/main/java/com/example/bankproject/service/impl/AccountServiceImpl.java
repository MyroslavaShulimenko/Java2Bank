package com.example.bankproject.service.impl;

import com.example.bankproject.entity.Account;
import com.example.bankproject.repository.AccountRepository;
import com.example.bankproject.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
   private final AccountRepository accountRepository;

    @Override
    public Account getAccountById(BigInteger id) {
        return accountRepository.getAccountById(id);
    }

}
