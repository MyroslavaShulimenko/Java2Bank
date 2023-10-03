package com.example.bankproject.entity.enums;

import lombok.Getter;

@Getter
public enum TransactionType {
    COMPLETED(1),
    IN_PROGRESS(2),
    CANCELED(0);
    private final int value;

    TransactionType(int value) {
        this.value = value;
    }
}
