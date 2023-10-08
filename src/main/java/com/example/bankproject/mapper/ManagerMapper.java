package com.example.bankproject.mapper;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.dto.ManagerDto;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.Manager;
import com.example.bankproject.mapper.entity.enums.StatusState;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Mapper(componentModel = "spring")
public interface ManagerMapper {

        ManagerDto mapToDto(Manager manager);
}
