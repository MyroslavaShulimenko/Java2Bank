package com.example.bankproject.util;

import com.example.bankproject.dto.AccountDto;

public class DtoCreator {
    public static AccountDto getAccountDto(){
       return new AccountDto(
               new String("1"),
               new String("null"),
               new String("AD2023033"),
               new String("SALARY"),
               new String("ACTIVE"),
               new String("12000.00"),
               new String("UAH")

       );
    }
}
