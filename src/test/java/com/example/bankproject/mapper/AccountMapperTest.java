package com.example.bankproject.mapper;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AccountMapperTest {
    private AccountMapper accountMapper;

    @BeforeEach
    public void setUp() {
        accountMapper = Mappers.getMapper(AccountMapper.class);
    }
    @Test
    public void testMapToDto() {
        // Создаем объекты
        Account account = createAccount(1L);
        //  метод mapToDto
        AccountDto accountDto = accountMapper.mapToDto(account);
        // Проверяем, что результаты соответствуют ожиданиям
        assertEquals(account.getClient().getId().toString(), accountDto.getClientId());
    }

    private static Account createAccount(Long id) {
        Client client = new Client();
        client.setId(id);
        Account account = new Account();
        account.setClient(client);
        return account;
    }

    @Test
    public void testMapToListDto() {
        //  список объектов
        Account account = createAccount(1L);
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        Account account2 = createAccount(2L);
        accounts.add(account2);

        //  mapToListDto
        List<AccountDto> accountDtos = accountMapper.mapToListDto(accounts);

        // Проверка, что результаты соответствуют ожиданиям
        assertEquals(accounts.size(), accountDtos.size());
        for (int i = 0; i < accounts.size(); i++) {
            assertEquals(accounts.get(i).getClient().getId().toString(), accountDtos.get(i).getClientId());
        }
    }
}

