package com.example.bankproject.entity.enums;

import lombok.Getter;

@Getter
public enum Currencies {
    UAH(0),
    EUR(1),
    USD(2);
    private final int value;

    Currencies(int value) {
        this.value = value;
    }
}


