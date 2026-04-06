package com.programacion4.unidad4ej5.feature.socio.services.impl.domain;

import com.programacion4.unidad4ej5.config.exceptions.ResourceConflictException;
import com.programacion4.unidad4ej5.config.exceptions.ResourceNotFoundException;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioUpdateResponseDto;
import com.programacion4.unidad4ej5.feature.socio.mappers.SocioMapper;
import com.programacion4.unidad4ej5.feature.socio.models.Socio;
import com.programacion4.unidad4ej5.feature.socio.repositories.ISocioRepository;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain.ISocioUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class SocioUpdateService implements ISocioUpdateService {
    private final ISocioRepository socioRepository;

    @Override
    public SocioUpdateResponseDto update(SocioUpdateRequestDto dto) {
        Socio socio = socioRepository.findByDni(dto.getSocioDni());
        if (socio == null) {
            throw new ResourceNotFoundException("El DNI del socio no está registrado");
        }

        if (dto.getAlias() != null) {
            socio.setAlias(dto.getAlias());
        }

        if (dto.getUrlFoto() != null) {
            socio.setUrlFoto(dto.getUrlFoto());
        }

        Socio socioA = socioRepository.save(socio);
        return SocioMapper.toResponseDtoU(socioA);
    }
}
