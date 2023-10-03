package com.example.bankproject.entity.enums;

import lombok.Getter;

@Getter
public enum ProductType {
    DEPOSIT(0),
    CREDIT(1),
    SALARY(2),
    CURRENT(3);

    private final int value;

    ProductType(int value) {
        this.value = value;
    }
}
