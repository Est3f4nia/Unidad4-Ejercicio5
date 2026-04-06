package com.programacion4.unidad4ej5.feature.socio.controllers;

import com.programacion4.unidad4ej5.config.BaseResponse;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioUpdateResponseDto;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain.ISocioUpdateService;
import com.programacion4.unidad4ej5.shared.validation.groups.OnUpdate;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/socios")
@AllArgsConstructor
public class SocioUpdateController {
    private final ISocioUpdateService socioUpdateService;

    @PatchMapping
    public ResponseEntity<SocioUpdateResponseDto> update(
            @Validated(OnUpdate.class) @RequestBody SocioUpdateRequestDto dto
            ) {
        SocioUpdateResponseDto resp = socioUpdateService.update(dto);
        return ResponseEntity.ok(resp);
    }

}
