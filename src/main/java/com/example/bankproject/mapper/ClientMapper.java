package com.example.bankproject.mapper;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.enums.StatusState;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
@Component
@Mapper(componentModel = "spring",
        imports = {LocalDate.class})
public interface ClientMapper {

        @Mapping(target = "status", source = "status", qualifiedByName = "ToUpperCase")
        Client mapToEntity(ClientDto clientDto);
        @Named("ToUpperCase")
        default StatusState statusToUpperCase(String status) {
            return StatusState.valueOf(status.toUpperCase());
        }
        @IterableMapping(qualifiedByName = "mapClientToDto")
        List<ClientDto> mapToListDto(List<Client> clients);
        @Named("mapClientToDto")
        ClientDto mapToDto(Client save);
}
