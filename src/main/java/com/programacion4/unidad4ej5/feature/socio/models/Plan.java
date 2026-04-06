package com.programacion4.unidad4ej5.feature.socio.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;


@Entity
@Table(name = "planes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlan;

    private String socioDni;
    private String obj;
    private Integer frecS;
    private Double pesoInicial;
    private Double altura;
    private List<Long> ejercicios;
}
