package com.example.bankproject.service;

import com.example.bankproject.entity.Account;
import com.example.bankproject.entity.Manager;

import java.math.BigInteger;

public interface ManagerService {


    Manager getManagerById(BigInteger id);

    void deleteManagerById(BigInteger id);
}
