package com.example.bankproject.controller;

import com.example.bankproject.mapper.entity.Agreement;
import com.example.bankproject.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth/agreements")
public class AgreementController {
    private final AgreementService agreementServise;

    @GetMapping("/{id}")
    public Agreement getAgreementById (@PathVariable("id") BigInteger id){
        return agreementServise.getAgreementById(id);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addAgreement(@RequestBody Agreement agreement) {
        agreementServise.addAgreement(agreement);
        //  код для обработки объекта Agreement / добавляет только без свзей и id
        return ResponseEntity.ok("Agreement успешно добавлен");
    }

}
