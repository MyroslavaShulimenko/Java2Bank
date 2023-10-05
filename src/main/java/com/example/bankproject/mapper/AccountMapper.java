package com.example.bankproject.mapper;

import com.example.bankproject.dto.AccountDto;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Client;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Mapper(componentModel = "spring", imports = {Client.class} )

public interface AccountMapper {
    @Named("mapAccountToDto")
    @Mapping(target = "clientId", source = "account.client.id")
    AccountDto mapToDto(Account account);
    @IterableMapping(qualifiedByName = "mapAccountToDto")
    List<AccountDto> mapToListDto(List<Account>accounts);
}

