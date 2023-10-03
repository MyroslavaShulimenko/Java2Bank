package com.example.bankproject.service.impl;

import com.example.bankproject.entity.Agreement;
import com.example.bankproject.repository.AgreementRepository;
import com.example.bankproject.service.AgreementServise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AgreementServiseImpl  implements AgreementServise {
    private final AgreementRepository agreementRepository;
    @Override
    public Agreement getAgreementById(BigInteger id) {
        return agreementRepository.getAgreementById(id);
    }

    @Override
    public void addAgreement(Agreement agreement) {
         agreementRepository.save(agreement);
    }

    @Override
    public Agreement addOrUpdateAgreement(Agreement agreement ) {
            return agreementRepository.save(agreement);
    }
}
