package com.programacion4.unidad4ej5.feature.socio.controllers;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDto;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.IPlanCreateService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socios/planes")
@AllArgsConstructor
public class PlanCreateController {
    private final IPlanCreateService planCreateService;

    @PostMapping
    public ResponseEntity<PlanResponseDto> create(@Valid @RequestBody PlanCreateRequestDto dto) {
        PlanResponseDto resp = planCreateService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(resp);
    }
}
