package com.programacion4.unidad4ej5.feature.socio.controllers;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDto;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain.IPagoCreateService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socios/pagos")
@AllArgsConstructor
public class PagoCreateController {
    private final IPagoCreateService pagoCreateService;

    @PostMapping
    private ResponseEntity<PagoResponseDto> create(@Valid @RequestBody PagoCreateRequestDto dto) {
        PagoResponseDto resp = pagoCreateService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(resp);
    }
}
