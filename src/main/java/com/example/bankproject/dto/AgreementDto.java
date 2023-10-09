package com.example.bankproject.dto;

import com.example.bankproject.mapper.entity.Account;
import com.example.bankproject.mapper.entity.Manager;
import com.example.bankproject.mapper.entity.enums.ProductType;
import com.example.bankproject.mapper.entity.enums.StatusState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.CascadeType.REFRESH;

@Value
@Builder
@Data
@AllArgsConstructor
@Setter
public class AgreementDto {
    String id;
    String productId;
    String interestRate;
    String status;
    String totalsum;

    String accountId;

    String managerName;
    String clientName;
}
