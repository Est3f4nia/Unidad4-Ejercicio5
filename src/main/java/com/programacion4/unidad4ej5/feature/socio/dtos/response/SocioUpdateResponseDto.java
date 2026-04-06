package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocioUpdateResponseDto {
    private String socioDni;
    private String urlFoto;
    private String alias;
}
