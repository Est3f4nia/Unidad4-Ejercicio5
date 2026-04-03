package com.programacion4.unidad4ej5.feature.socio.mapper;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;
import com.programacion4.unidad4ej5.feature.socio.models.Socio;
import org.springframework.stereotype.Component;

@Component
public class SocioMapper {
    public Socio toEntity(SocioCreateDto dto) {
        Socio socio = new Socio();
        socio.setNombre(dto.getNombre());
        socio.setApellido(dto.getApellido());
        socio.setEmail(dto.getEmail());
        socio.setDni(dto.getDni());
        socio.setFechaNacimiento(dto.getFechaNacimiento());
        socio.setTelefono(dto.getTelefono());
        return socio;
    }

    public SocioResponseDto toResponseDto(Socio socio) {
        SocioResponseDto dto = new SocioResponseDto();
        dto.setId(socio.getId());
        dto.setNombre(socio.getNombre());
        dto.setApellido(socio.getApellido());
        dto.setFechaNacimiento(socio.getFechaNacimiento());
        return dto;
    }
}
