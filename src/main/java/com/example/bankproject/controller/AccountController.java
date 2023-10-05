package com.example.bankproject.controller;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.enums.StatusState;
import com.example.bankproject.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("auth/accounts")
@RequiredArgsConstructor
public class AccountController {
private final AccountService accountService;
@GetMapping("/{id}")
public Account getAccountById (@PathVariable("id") BigInteger id){

   return accountService.getAccountById(id);
}
   @GetMapping("/status/{status}")
   public List<AccountDto> getAllAccountsWhereStatusIs(@PathVariable("status") StatusState status){
      return accountService.getAllAccountsWhereStatusIs(status);
   }
}
