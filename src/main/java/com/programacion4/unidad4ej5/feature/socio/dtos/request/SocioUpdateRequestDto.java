package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import com.programacion4.unidad4ej5.shared.validation.groups.OnUpdate;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocioUpdateRequestDto {
    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 dígitos")
    @NotNull(groups = OnUpdate.class, message = "El DNI es obligatorio")
    private String socioDni;

    @URL(message = "La URL no es válida", groups = OnUpdate.class)
    private String urlFoto;

    @Size(min = 3, max = 15, message = "El alias debe tener entre 3 y 15 caracteres", groups = OnUpdate.class)
    @Pattern(regexp = "\\S+", message = "El alias no debe contener espacios", groups = OnUpdate.class)
    private String alias;
}
