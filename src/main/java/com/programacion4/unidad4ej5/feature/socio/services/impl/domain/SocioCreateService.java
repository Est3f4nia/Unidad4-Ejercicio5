package com.programacion4.unidad4ej5.feature.socio.services.impl.domain;

import com.programacion4.unidad4ej5.config.exceptions.BadRequestException;
import com.programacion4.unidad4ej5.config.exceptions.ResourceConflictException;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;
import com.programacion4.unidad4ej5.feature.socio.mapper.SocioMapper;
import com.programacion4.unidad4ej5.feature.socio.models.Socio;
import com.programacion4.unidad4ej5.feature.socio.repositories.ISocioRepository;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.IFechaValidationService;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.ISocioCreateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class SocioCreateService implements ISocioCreateService {
    private final ISocioRepository socioRepository;
    private IFechaValidationService fechaValidationService;

    @Override
    public SocioResponseDto create(SocioCreateRequestDto dto) {
        if (fechaValidationService.esMas18(dto.getFechaNacimiento())) {
            throw new BadRequestException(
                    "El socio debe ser mayor de 18"
            );
        }

        if (socioRepository.existsByDni(dto.getDni())) {
            throw new ResourceConflictException(
                    "El dni ya está registrado"
            );
        }

        Socio socioM = SocioMapper.toEntity(dto);
        Socio socio = socioRepository.save(socioM);
        return SocioMapper.toResponseDto(socio);
    }
}
