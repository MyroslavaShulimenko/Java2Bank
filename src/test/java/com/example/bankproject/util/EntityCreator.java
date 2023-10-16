package com.example.bankproject.util;

import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Agreement;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.Manager;
import com.example.bankproject.mapper.entity.enums.Currencies;
import com.example.bankproject.mapper.entity.enums.ProductType;
import com.example.bankproject.mapper.entity.enums.StatusState;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EntityCreator {
    public static Account creatorAccount() {
        Account account = new Account();
        account.setId((long) 1.0);
        account.setStatus(StatusState.valueOf("ACTIVE"));
        account.setClient(new Client());
//        account.setClient(creatorClient());
        account.setName("AD2023033");
        account.setType(ProductType.valueOf("SALARY"));
        account.setStatus(StatusState.valueOf("ACTIVE"));
        account.setBalance(BigDecimal.valueOf(12000.00));
        account.setCurrencyCode(Currencies.valueOf("UAH"));
        account.setCreatedAt("2023-02-14");
        return account;
    }

    public static Client creatorClient() {
        Client client = new Client();
        client.setId(1L);
        client.setStatus(StatusState.valueOf("ACTIVE"));
        client.setTaxСode("1212121212121");
        client.setFirstName("Sergey");
        client.setLastName("Serov");
        client.setEmail("ssss@ss.com");
        client.setAddress("Sholochova");
        client.setPhone("12121212121");
        client.setCreatedAt(LocalDate.parse("2023-02-02"));
        return client;
    }

    public static Manager cretorManager() {
        Manager manager = new Manager();
        manager.setId(1L);
        manager.setFirstName("Val");
        manager.setLastName("Volkov");
        manager.setStatus(StatusState.valueOf("ACTIVE"));
        manager.setDescription("division 1");
        manager.setCreatedAt(LocalDate.parse("2023-04-04"));
//        manager.setAgreements(new HashSet<>().add(EntityCreator.creatorAgreement()));
        return manager;
    }

    public static Agreement creatorAgreement() {
        Agreement agreement = new Agreement();
        agreement.setId(2L);
        agreement.setProductId(ProductType.valueOf("SALARY"));
        agreement.setInterestRate(BigDecimal.valueOf(1.00));
        agreement.setStatus(StatusState.valueOf("ACTIVE"));
        agreement.setTotalsum(BigDecimal.valueOf(45000.00));
        agreement.setAccount(EntityCreator.creatorAccount());
        agreement.setManager(new Manager());
        return agreement;
    }
}
