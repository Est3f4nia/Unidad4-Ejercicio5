package com.programacion4.unidad4ej5.feature.socio.repositories;

import com.programacion4.unidad4ej5.feature.socio.models.Socio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISocioRepository extends CrudRepository<Socio, Long> {
    boolean existsByDni(String dni);
}
