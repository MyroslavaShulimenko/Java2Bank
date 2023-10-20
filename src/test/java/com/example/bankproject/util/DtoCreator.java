package com.example.bankproject.util;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.dto.ClientDto;

public class DtoCreator {
    public static AccountDto getAccountDto() {
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

    public static ClientDto getClientDto() {
        return new ClientDto("ACTIVE","1212121212121","Sergey","Serov","ssss@ss.com","Sholochova",
                "12121212121","2023-02-02");

    }
}
