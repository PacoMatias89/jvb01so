package com.hackaboss.c3d4ejercicio3_opcional.exception;

public class EventNotFoundException extends Exception {
    private String message;

    public EventNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
