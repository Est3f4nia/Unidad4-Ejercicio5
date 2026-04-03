package com.programacion4.unidad4ej5.feature.socio.mapper;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateRequestDto;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDto;
import com.programacion4.unidad4ej5.feature.socio.models.Plan;

public class PlanMapper {
    public static Plan toEntity(PlanCreateRequestDto dto) {
        Plan plan = new Plan();
        plan.setSocioDni(dto.getSocioDni());
        plan.setObj(dto.getObj());
        plan.setFrecS(dto.getFrecS());
        plan.setPesoInicial(dto.getPesoInicial());
        plan.setAltura(dto.getAltura());
        plan.setEjercicios(dto.getEjercicios());
        return plan;
    }

    public static PlanResponseDto toResponseDto(Plan plan) {
        PlanResponseDto dto = new PlanResponseDto();
        dto.setSocioDni(plan.getSocioDni());
        dto.setObj(plan.getObj());
        dto.setFrecS(plan.getFrecS());
        dto.setPesoInicial(plan.getPesoInicial());
        dto.setAltura(plan.getAltura());
        dto.setEjercicios(plan.getEjercicios());
        return dto;
    }
}
