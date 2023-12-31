package com.example.bankproject.mapper;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.mapper.entity.enums.StatusState;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ClientMapperTest {
    private final ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class);
    @Test
    void mapToEntity() {
        // Создаем тестовые данные
        ClientDto clientDto = new ClientDto("ACTIVE","1111111111","aaaaaaaaaaa","aaaaaaaaa","aa@ss.com","aaaa","1111111","2023-04-04");

        // Вызываем метод маппинга
        Client client = clientMapper.mapToEntity(clientDto);

        // Проверяем, что маппинг корректно работает
        assertEquals(client.getStatus(), StatusState.ACTIVE);
    }

    @Test
    void statusToUpperCase() {
        // Создаем экземпляр реализации ClientMapper
        ClientMapper clientMapper = new ClientMapperImpl();

        // Вызываем метод statusToUpperCase
        StatusState result = clientMapper.statusToUpperCase("active");

        // Проверяем, что метод корректно преобразует строку в верхний регистр и возвращает соответствующее значение enum
        assertEquals(result, StatusState.ACTIVE);
    }


    @Test
    void mapToDto() {
        // Создаем тестовые данные
        Client client = new Client();
        client.setStatus(StatusState.CLOSED);
        client.setCreatedAt(LocalDate.now());

        // Вызываем метод маппинга
        ClientDto clientDto = clientMapper.mapToDto(client);

        // Проверяем, что маппинг корректно работает
        assertEquals(clientDto.getStatus(), "CLOSED");
    }
}
