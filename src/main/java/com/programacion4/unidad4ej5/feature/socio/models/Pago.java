package com.programacion4.unidad4ej5.feature.socio.models;

import com.programacion4.unidad4ej5.feature.socio.models.compl.MedioPago;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table (name = "pagos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pago {
    @Id
    private String cod;

    private String socioDni;
    private BigDecimal monto;
    private LocalDate fechaVenc;
    private MedioPago medioPago;
}
