package com.example.bankproject.entity.enums;

import lombok.Getter;

@Getter
public enum StatusState {
    ACTIVE(1),
    CLOSED(2);
    private final int value;

    StatusState(int value) {
        this.value = value;
    }
}
