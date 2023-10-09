package com.example.bankproject.mapper;

import com.example.bankproject.dto.AgreementDto;
import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Agreement;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.Manager;
import com.example.bankproject.mapper.entity.enums.StatusState;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Mapper(componentModel = "spring",
        imports = {Manager.class, Account.class,Client.class})
public interface AgreementMapper {

        @Mapping(target = "accountId", source = "agreement.account.id")
        @Mapping(target = "managerName", source = "agreement.manager.firstName")
        @Mapping(target = "clientName", source = "agreement.account.client.firstName")

        AgreementDto mapToDto(Agreement agreement);
}
