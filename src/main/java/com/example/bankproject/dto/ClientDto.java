package com.example.bankproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Value
@Builder
@Data
@AllArgsConstructor
public class ClientDto {
    Long id;

    String status;

    String taxСode;

    String firstName;

    String lastName;

    String email;

    String address;

    String phone;


}
