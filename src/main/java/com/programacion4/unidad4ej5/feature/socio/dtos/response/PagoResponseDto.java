package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import com.programacion4.unidad4ej5.feature.socio.models.compl.MedioPago;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoResponseDto {
    private String socioDni;
    private String cod;
    private BigDecimal monto;
    private LocalDate fechaVenc;
    private MedioPago medioPago;
}
