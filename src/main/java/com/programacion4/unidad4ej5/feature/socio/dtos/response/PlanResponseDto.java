package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanResponseDto {
    private String socioDni;
    private String obj;
    private Integer frecS;
    private Double pesoInicial;
    private Double altura;
    private List<Long> ejercicios;
}
