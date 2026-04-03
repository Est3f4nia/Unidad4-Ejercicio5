package com.programacion4.unidad4ej5.config;

import com.programacion4.unidad4ej5.config.exceptions.CustomException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.Instant;
import java.util.List;


@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Maneja las excepciones personalizadas
     * @param ex La excepción personalizada
     * Captura las excepciones personalizadas y las convierte en una respuesta HTTP con el estado de la excepción
     */
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<BaseResponse<Object>> handleCustomException(
            CustomException ex,
            HttpServletRequest request) {

        BaseResponse<Object> response = BaseResponse.builder()
                .message(ex.getMessage())
                .errors(ex.getErrors())
                .timestamp(Instant.now().toString())
                .status(ex.getStatus().value())
                .path(request.getRequestURI())
                .build();

        return new ResponseEntity<>(response, ex.getStatus());
    }

    /**
     * Maneja las excepciones de validación
     * @param ex La excepción de validación
     * @return La respuesta HTTP con el estado de la excepción
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<BaseResponse<Object>> handleValidation(
            MethodArgumentNotValidException ex,
            HttpServletRequest request) {

        List<String> errors = ex.getBindingResult().getFieldErrors().stream()
                .map(f -> f.getField() + ": " + f.getDefaultMessage())
                .toList();

        BaseResponse<Object> response = BaseResponse.builder()
                .message("[!] Error de validación.")
                .errors(errors)
                .timestamp(Instant.now().toString())
                .status(HttpStatus.BAD_REQUEST.value())
                .path(request.getRequestURI())
                .build();

        return ResponseEntity.badRequest().body(response);
    }

    /**
     * Maneja las excepciones genéricas
     * @param ex La excepción genérica
     * @return La respuesta HTTP con el estado de la excepción
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse<Object>> handleGeneric(
            Exception ex,
            HttpServletRequest request) {

        BaseResponse<Object> response = BaseResponse.builder()
                .message("[!] Ocurrió un error inesperado.")
                .errors(List.of("[!] Contacte al administrador."))
                .timestamp(Instant.now().toString())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .path(request.getRequestURI())
                .build();

        return ResponseEntity.internalServerError().body(response);
    }
}
