package com.programacion4.unidad4ej5.feature.socio.services.interfaces;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDto;

public interface IPlanCreateService {
    PlanResponseDto create(PlanCreateRequestDto dto);
}
