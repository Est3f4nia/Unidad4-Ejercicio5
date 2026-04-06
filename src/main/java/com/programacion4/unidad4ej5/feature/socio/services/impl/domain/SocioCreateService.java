package com.programacion4.unidad4ej5.feature.socio.services.impl.domain;

import com.programacion4.unidad4ej5.config.exceptions.ResourceConflictException;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;
import com.programacion4.unidad4ej5.feature.socio.mappers.SocioMapper;
import com.programacion4.unidad4ej5.feature.socio.models.Socio;
import com.programacion4.unidad4ej5.feature.socio.repositories.ISocioRepository;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain.ISocioCreateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class SocioCreateService implements ISocioCreateService {
    private final ISocioRepository socioRepository;

    @Override
    public SocioResponseDto create(SocioCreateRequestDto dto) {
        if (socioRepository.existsByDni(dto.getDni())) {
            throw new ResourceConflictException(
                    "El dni ya está registrado"
            );
        }

        Socio socioM = SocioMapper.toEntity(dto);
        System.out.println(socioM);
        Socio socio = socioRepository.save(socioM);
        return SocioMapper.toResponseDto(socio);
    }
}
