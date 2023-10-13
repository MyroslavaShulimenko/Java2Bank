package com.example.bankproject.controller;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.enums.Currencies;
import com.example.bankproject.mapper.entity.enums.ProductType;
import com.example.bankproject.mapper.entity.enums.StatusState;
import com.example.bankproject.repository.ClientRepository;
import com.example.bankproject.repository.ManagerRepository;
import com.example.bankproject.service.AccountService;
import com.example.bankproject.service.AgreementService;
import com.example.bankproject.util.DtoCreator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureMockMvc
@WebMvcTest(AccountController.class)
public class AccountControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccountService accountService;
    @MockBean
    private AgreementService agreementService;
    @MockBean
    private ClientRepository clientRepository;
    @MockBean
    private ManagerRepository managerRepository;

    @Test
    void testGetAccountById() throws Exception {
        BigInteger accountId = BigInteger.valueOf(1);
        Account account = new Account();
        account.setId(1L);

        Mockito.when(accountService.getAccountById(accountId)).thenReturn(account);

        mockMvc.perform(MockMvcRequestBuilders.get("/auth/accounts/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(accountId.intValue()));
    }

    @Test
    void testGetAllAccountsWhereStatusIs() throws Exception {
        StatusState status = StatusState.ACTIVE;
        List<AccountDto> accountDtoList = Collections.singletonList(DtoCreator.getAccountDto());

        Mockito.when(accountService.getAllAccountsWhereStatusIs(status)).thenReturn(accountDtoList);

        mockMvc.perform(MockMvcRequestBuilders.get("/auth/accounts/status/ACTIVE"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value(accountDtoList.get(0).getName()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].status").value(accountDtoList.get(0).getStatus()));
    }
}
