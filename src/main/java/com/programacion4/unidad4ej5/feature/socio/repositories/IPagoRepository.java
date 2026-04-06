package com.programacion4.unidad4ej5.feature.socio.repositories;

import com.programacion4.unidad4ej5.feature.socio.models.Pago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepository extends CrudRepository<Pago, Long> {
    Boolean existsByCod(String cod);
}
