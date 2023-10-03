package com.example.bankproject.service.impl;

import com.example.bankproject.entity.Manager;
import com.example.bankproject.repository.AccountRepository;
import com.example.bankproject.repository.ManagerRepository;
import com.example.bankproject.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class ManagerServiseImpl implements ManagerService {
    private final ManagerRepository managerRepository;
    @Override
    public Manager getManagerById(BigInteger id) {
        return managerRepository.getManagerById(id);
    }
    public void deleteManagerById(BigInteger id) {
        managerRepository.deleteById(id);
    }
}
