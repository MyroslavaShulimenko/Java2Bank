package com.example.bankproject.service;

import com.example.bankproject.dto.ManagerDto;
import com.example.bankproject.mapper.entity.Manager;

import java.math.BigInteger;

public interface ManagerService {


    Manager getManagerById(BigInteger id);

    void deleteManagerById(BigInteger id);

    ManagerDto getManagerDtoById(BigInteger idDto);
}
