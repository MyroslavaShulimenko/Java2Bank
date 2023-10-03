package com.example.bankproject.service;

import com.example.bankproject.entity.Account;

import java.math.BigInteger;

public interface AccountService {
   Account getAccountById(BigInteger id);

}
