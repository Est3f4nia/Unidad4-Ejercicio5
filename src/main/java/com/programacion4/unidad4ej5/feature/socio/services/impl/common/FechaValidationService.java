package com.programacion4.unidad4ej5.feature.socio.services.impl.common;

import com.programacion4.unidad4ej5.feature.socio.services.interfaces.IFechaValidationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;


@Service
@AllArgsConstructor
public class FechaValidationService implements IFechaValidationService {
    public boolean esMas18(LocalDate fecha) {
        return fecha != null &&
                Period.between(fecha, LocalDate.now()).getYears() >= 18;
    }
}
