package com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;

public interface ISocioCreateService {
    SocioResponseDto create(SocioCreateRequestDto dto);
}
