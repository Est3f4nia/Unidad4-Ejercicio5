package com.programacion4.unidad4ej5.feature.socio.services.impl.domain;

import com.programacion4.unidad4ej5.config.exceptions.BadRequestException;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDto;
import com.programacion4.unidad4ej5.feature.socio.mappers.PagoMapper;
import com.programacion4.unidad4ej5.feature.socio.models.Pago;
import com.programacion4.unidad4ej5.feature.socio.models.compl.MedioPago;
import com.programacion4.unidad4ej5.feature.socio.repositories.IPagoRepository;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.common.IDniValidationService;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain.IPagoCreateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;


@Service
@AllArgsConstructor
public class PagoCreateService implements IPagoCreateService {
    private final IPagoRepository pagoRepository;
    private final IDniValidationService dniValidationService;

    @Override
    public PagoResponseDto create(PagoCreateRequestDto dto) {
        if (!dniValidationService.dniExists(dto.getSocioDni())) {
            throw new BadRequestException("El DNI del socio no está registrado");
        }

        String cod = generarCodTransaccion();

        Pago pagoM = PagoMapper.toEntity(dto);
        pagoM.setCod(cod);
        Pago pago = pagoRepository.save(pagoM);
        return PagoMapper.toResponseDto(pago);
    }

    private String generarCodTransaccion() {
        String cod;
        do {
            cod = "PAY-" +
                    UUID.randomUUID().toString().substring(0, 4).toUpperCase() +
                    "-" + UUID.randomUUID().toString().substring(0, 4).toUpperCase();
        } while (pagoRepository.existsByCod(cod));  // evita confilctos
        return cod;
    }
}
