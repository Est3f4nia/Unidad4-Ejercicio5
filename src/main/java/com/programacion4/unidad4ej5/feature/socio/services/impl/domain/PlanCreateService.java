package com.programacion4.unidad4ej5.feature.socio.services.impl.domain;

import com.programacion4.unidad4ej5.config.exceptions.BadRequestException;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDto;
import com.programacion4.unidad4ej5.feature.socio.mappers.PlanMapper;
import com.programacion4.unidad4ej5.feature.socio.models.Plan;
import com.programacion4.unidad4ej5.feature.socio.repositories.IPlanRepository;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.common.IDniValidationService;
import com.programacion4.unidad4ej5.feature.socio.services.interfaces.domain.IPlanCreateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlanCreateService implements IPlanCreateService {
    private final IPlanRepository planRepository;
    private final IDniValidationService dniValidationService;

    @Override
    public PlanResponseDto create(PlanCreateRequestDto dto) {
        if (!dniValidationService.dniExists(dto.getSocioDni())) {
            throw new BadRequestException("El DNI del socio no está registrado");
        }

        Plan planM = PlanMapper.toEntity(dto);
        Plan plan = planRepository.save(planM);
        return PlanMapper.toResponseDto(plan);
    }
}
