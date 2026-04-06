package com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioUpdateResponseDto;

public interface ISocioUpdateService {
    SocioUpdateResponseDto update(SocioUpdateRequestDto dto);
}
