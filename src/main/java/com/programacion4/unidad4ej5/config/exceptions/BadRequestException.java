package com.programacion4.unidad4ej5.config.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;

public class BadRequestException extends CustomException {

    // Caso simple
    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST, List.of(message));
    }

    // Caso complejo
    public BadRequestException(String message, List<String> errors) {
        super(message, HttpStatus.BAD_REQUEST, errors);
    }
}