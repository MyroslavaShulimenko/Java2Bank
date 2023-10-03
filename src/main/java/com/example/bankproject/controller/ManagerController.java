package com.example.bankproject.controller;

import com.example.bankproject.entity.Manager;
import com.example.bankproject.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("auth/managers")
@RequiredArgsConstructor
public class ManagerController {
    private final ManagerService managerService;
    @GetMapping("/{id}")
    public Manager getManagerById (@PathVariable("id") BigInteger id){
        return managerService.getManagerById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteManagerById (@PathVariable("id") BigInteger id){
         managerService.deleteManagerById(id);
    }
}