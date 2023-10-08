package com.example.bankproject.service.impl;

import com.example.bankproject.dto.ManagerDto;
import com.example.bankproject.mapper.ManagerMapper;
import com.example.bankproject.mapper.entity.Manager;
import com.example.bankproject.repository.ManagerRepository;
import com.example.bankproject.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

@Service
//@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository, ManagerMapper managerMapper) {
        this.managerRepository = managerRepository;
        this.managerMapper = managerMapper;
    }

    @Override
    public Manager getManagerById(BigInteger id) {
        return managerRepository.getManagerById(id);
    }

    public void deleteManagerById(BigInteger id) {
        managerRepository.deleteById(id);
    }

    @Override
    @Transactional
    public ManagerDto getManagerDtoById(BigInteger idDto) {
        Manager manager = managerRepository.getManagerById(idDto);
        return managerMapper.mapToDto(manager);
    }
}
