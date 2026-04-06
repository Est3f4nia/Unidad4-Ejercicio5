package com.programacion4.unidad4ej5.feature.socio.mappers;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDto;
import com.programacion4.unidad4ej5.feature.socio.models.Pago;

public class PagoMapper {
    public static Pago toEntity(PagoCreateRequestDto dto) {
        Pago pago = new Pago();
        pago.setSocioDni(dto.getSocioDni());
        pago.setMonto(dto.getMonto());
        pago.setFechaVenc(dto.getFechaVenc());
        pago.setMedioPago(dto.getMedioPago());
        return pago;
    }

    public static PagoResponseDto toResponseDto(Pago pago) {
        PagoResponseDto dto = new PagoResponseDto();
        dto.setSocioDni(pago.getSocioDni());
        dto.setCod(pago.getCod());
        dto.setMonto(pago.getMonto());
        dto.setFechaVenc(pago.getFechaVenc());
        dto.setMedioPago(pago.getMedioPago());
        return dto;
    }
}
