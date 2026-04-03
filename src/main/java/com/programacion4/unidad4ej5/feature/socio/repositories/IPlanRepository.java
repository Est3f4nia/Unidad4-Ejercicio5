package com.programacion4.unidad4ej5.feature.socio.repositories;

import com.programacion4.unidad4ej5.feature.socio.models.Plan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlanRepository extends CrudRepository<Plan, Long> {
}
