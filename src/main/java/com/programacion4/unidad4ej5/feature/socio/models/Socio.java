package com.programacion4.unidad4ej5.feature.socio.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


@Entity
@Table(name = "socios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Socio {
    @Id
    private String dni;

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String alias;
    private String urlFoto;
}
