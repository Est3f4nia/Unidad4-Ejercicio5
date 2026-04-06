package com.programacion4.unidad4ej5.shared.validation.validators;

import com.programacion4.unidad4ej5.shared.validation.annotations.Adulto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class AdultoValidator implements ConstraintValidator<Adulto, LocalDate> {

    @Override
    public boolean isValid(LocalDate fecha, ConstraintValidatorContext context) {
        if (fecha == null) return true; // se espera que la anotación valide junto con not null
        return fecha.isBefore(LocalDate.now().minusYears(18));
    }
}
