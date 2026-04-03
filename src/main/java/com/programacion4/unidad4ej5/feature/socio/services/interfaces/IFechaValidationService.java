package com.programacion4.unidad4ej5.feature.socio.services.interfaces;

import java.time.LocalDate;


public interface IFechaValidationService {
    public boolean esMas18(LocalDate fecha);
}
