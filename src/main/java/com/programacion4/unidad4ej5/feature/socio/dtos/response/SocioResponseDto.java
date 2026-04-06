package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocioResponseDto {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String telefono;
}
