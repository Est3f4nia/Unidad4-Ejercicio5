package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import com.programacion4.unidad4ej5.feature.socio.models.compl.MedioPago;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PagoCreateRequestDto {
    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 dígitos")
    private String socioDni;

//    @Pattern(regexp = "PAY-[A-Z0-9]{4}-[A-Z0-9]{4}",
//            message = "El código de transacción debe seguir el patrón PAY-XXXX-XXXX")
//    private String cod;

    /*
        Validación en caso de que el usuario deba ingresar manualmente el código de transacción.
        Pensé que sería "más real" que el sistema lo genere y luego lo devuelva. Dejo la validación
        por el cumplimiento de la consigna.
     */

    @NotNull
    @DecimalMin(value = "1000.00")
    @Digits(integer = 10, fraction = 2)
    private BigDecimal monto;

    @NotNull(message = "La fecha de vencimiento es obligatoria")
    @Future(message = "La fecha de vencimiento debe ser en el futuro")
    private LocalDate fechaVenc;

    @NotNull
    private MedioPago medioPago;
}
