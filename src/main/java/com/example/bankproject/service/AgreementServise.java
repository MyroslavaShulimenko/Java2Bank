package com.example.bankproject.service;

import com.example.bankproject.entity.Account;
import com.example.bankproject.entity.Agreement;

import java.math.BigInteger;

public interface AgreementServise {
    Agreement getAgreementById(BigInteger id);

   void addAgreement(Agreement agreement);

    Agreement addOrUpdateAgreement(Agreement agreement);
}
