package com.example.bankproject.dto;

import com.example.bankproject.mapper.entity.Agreement;
import com.example.bankproject.mapper.entity.enums.StatusState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.CascadeType.*;

@Value
@Builder
@Data
@AllArgsConstructor
public class ManagerDto {

    String firstName;
    String lastName;
    String status;
    String description;
}
