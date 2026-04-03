package com.programacion4.unidad4ej5.feature.socio.controllers;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.ISocioCreateService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/socios")
public class SocioCreateController {
    private final ISocioCreateService socioCreateService;

    @PostMapping
    public ResponseEntity<SocioResponseDto> create(@Valid @RequestBody SocioCreateDto dto) {
        SocioResponseDto resp = socioCreateService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED.body(resp));
    }
}
