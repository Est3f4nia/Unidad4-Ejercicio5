package com.programacion4.unidad4ej5.feature.socio.services.interfaces;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;

public interface ISocioCreateService {
    SocioResponseDto create(SocioCreateDto dto);
}
