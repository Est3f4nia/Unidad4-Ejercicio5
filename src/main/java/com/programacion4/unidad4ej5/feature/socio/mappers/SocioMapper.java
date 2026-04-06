package com.programacion4.unidad4ej5.feature.socio.mappers;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioUpdateResponseDto;
import com.programacion4.unidad4ej5.feature.socio.models.Socio;
import org.springframework.stereotype.Component;

@Component
public class SocioMapper {
    public static Socio toEntity(SocioCreateRequestDto dto) {
        Socio socio = new Socio();
        socio.setNombre(dto.getNombre());
        socio.setApellido(dto.getApellido());
        socio.setEmail(dto.getEmail());
        socio.setDni(dto.getDni());
        socio.setFechaNacimiento(dto.getFechaNacimiento());
        socio.setTelefono(dto.getTelefono());
        return socio;
    }

    public static SocioResponseDto toResponseDto(Socio socio) {
        SocioResponseDto dto = new SocioResponseDto();
        dto.setDni(socio.getDni());
        dto.setNombre(socio.getNombre());
        dto.setApellido(socio.getApellido());
        dto.setFechaNacimiento(socio.getFechaNacimiento());
        dto.setTelefono(socio.getTelefono());
        dto.setEmail(socio.getEmail());
        return dto;
    }

    public static SocioUpdateResponseDto toResponseDtoU(Socio socio) {
        SocioUpdateResponseDto dto = new SocioUpdateResponseDto();
        dto.setSocioDni(socio.getDni());
        dto.setAlias(socio.getAlias());
        dto.setUrlFoto(socio.getUrlFoto());
        return dto;
    }
}
