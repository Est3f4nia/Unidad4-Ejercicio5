package com.programacion4.unidad4ej5.feature.socio.services.impl.common;

import com.programacion4.unidad4ej5.feature.socio.repositories.ISocioRepository;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.common.IDniValidationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

// Evita llamar a SocioRepository desde services externos a la clase

@Service
@AllArgsConstructor
public class DniValidationService implements IDniValidationService {
    private final ISocioRepository socioRepository;

    @Override
    public Boolean dniExists(String dni) {
        if (socioRepository.existsByDni(dni)) return true;
        return false;
    }
}
