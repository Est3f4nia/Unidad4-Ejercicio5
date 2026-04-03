package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanCreateRequestDto {
    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 dígitos")
    private String socioDni;

    @NotBlank(message = "El objetivo no puede estar vacío")
    @Size(min = 10, max = 200, message = "El objetivo debe tener entre 10 y 200 caracteres")
    private String obj;

    @NotNull(message = "La frecuencia semanal es obligatoria")
    @Min(value = 1, message = "La frecuencia debe ser entre 1 y 7")
    @Max(value = 7, message = "La frecuencia debe ser entre 1 y 7")
    private Integer frecS;

    @NotNull(message = "El peso inicial es obligatorio")
    @DecimalMin(value = "30.0", message = "El peso mínimo es 30.0")
    @DecimalMax(value = "250.0", message = "El peso máximo es 250.0")
    private Double pesoInicial;

    @NotNull(message = "La altura es obligatoria")
    @DecimalMin(value = "1.0", message = "La altura mínima es 1.0")
    @DecimalMax(value = "2.5", message = "La altura máxima es 2.5")
    private Double altura;

    @NotNull(message = "La lista de ejercicios no puede estar vacía")
    @Size(min = 3, message = "Un plan debe tener por lo menos 3 ejercicios")
    private List<Long> ejercicios; // IDs de ejercicios
}
