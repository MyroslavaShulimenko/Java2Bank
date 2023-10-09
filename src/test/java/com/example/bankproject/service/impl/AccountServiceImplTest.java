package com.example.bankproject.service.impl;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.mapper.AccountMapper;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.enums.Currencies;
import com.example.bankproject.mapper.entity.enums.ProductType;
import com.example.bankproject.mapper.entity.enums.StatusState;
import com.example.bankproject.repository.AccountRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private AccountMapper accountMapper;

    @InjectMocks
    private AccountServiceImpl accountService;
    Account account = new Account(); //  тестовый объект Account

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

//        account.setId((long) 1.0);
//        account.setStatus(StatusState.valueOf("ACTIVE"));
//        account.setName("AD2023033");
//        account.setType(ProductType.valueOf("SALARY"));
//        account.setStatus(StatusState.valueOf("ACTIVE"));
//        account.setBalance(BigDecimal.valueOf(12000.00));
//        account.setCurrencyCode(Currencies.valueOf("UAH"));
//        account.setCreatedAt("2023-02-14");
    }

    @Test
    public void testGetAccountById() {
        BigInteger accountId = BigInteger.valueOf(1);

        when(accountRepository.getAccountById(accountId)).thenReturn(account);

        Account result = accountService.getAccountById(accountId);

        verify(accountRepository, times(1)).getAccountById(accountId);
        assertEquals(account, result);
    }

    @Test
    public void testGetAllAccountsWhereStatusIs() {
        StatusState status = StatusState.ACTIVE; // нужный статус
        List<Account> accounts = new ArrayList<>(); //  список аккаунтов
//        accounts.add(account);
        when(accountRepository.findAllAccountsWhereStatusIs(status)).thenReturn(accounts);

        List<AccountDto> accountDtos = new ArrayList<>(); //  список AccountDto
        when(accountMapper.mapToListDto(accounts)).thenReturn(accountDtos);

        List<AccountDto> result = accountService.getAllAccountsWhereStatusIs(status);

        verify(accountRepository, times(1)).findAllAccountsWhereStatusIs(status);
        verify(accountMapper, times(1)).mapToListDto(accounts);
        assertEquals(accountDtos, result);
    }
}
