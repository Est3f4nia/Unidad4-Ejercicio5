package com.programacion4.unidad4ej5.shared.validation.annotations;

import com.programacion4.unidad4ej5.shared.validation.validators.AdultoValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AdultoValidator.class)
@Documented
public @interface Adulto {
    String message() default "El socio debe ser mayor de 18";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
