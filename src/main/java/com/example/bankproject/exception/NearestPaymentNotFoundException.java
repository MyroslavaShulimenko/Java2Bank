package com.example.bankproject.exception;

public class NearestPaymentNotFoundException extends RuntimeException {

    public NearestPaymentNotFoundException(String message) {
        super(message);
    }
}