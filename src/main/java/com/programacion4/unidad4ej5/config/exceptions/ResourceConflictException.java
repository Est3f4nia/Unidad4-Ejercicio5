package com.programacion4.unidad4ej5.config.exceptions;

import org.springframework.http.HttpStatus;
import java.util.List;

public class ResourceConflictException extends CustomException {
    public ResourceConflictException(String message) {
        super(message, HttpStatus.CONFLICT, List.of(message));
    }
}
