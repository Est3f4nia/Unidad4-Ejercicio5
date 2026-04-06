package com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDto;

public interface IPagoCreateService {
    PagoResponseDto create(PagoCreateRequestDto dto);
}
