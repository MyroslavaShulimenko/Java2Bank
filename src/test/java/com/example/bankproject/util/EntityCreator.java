package com.example.bankproject.util;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.enums.Currencies;
import com.example.bankproject.mapper.entity.enums.ProductType;
import com.example.bankproject.mapper.entity.enums.StatusState;

import java.math.BigDecimal;

public class EntityCreator {
    public static Account creatorAccount() {
        Account account = new Account();
        account.setId((long) 1.0);
        account.setStatus(StatusState.valueOf("ACTIVE"));
        account.setClient(new Client());
        account.setName("AD2023033");
        account.setType(ProductType.valueOf("SALARY"));
        account.setStatus(StatusState.valueOf("ACTIVE"));
        account.setBalance(BigDecimal.valueOf(12000.00));
        account.setCurrencyCode(Currencies.valueOf("UAH"));
        account.setCreatedAt("2023-02-14");
        return account;
    }

}
