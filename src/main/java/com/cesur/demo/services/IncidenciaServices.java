package com.cesur.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cesur.demo.models.dto.IncidenciaDto;

@Service
public interface IncidenciaServices {
    IncidenciaDto getIncidenciaById(Long id);
    List<IncidenciaDto> getIncidenceByUserName(String username);
    void storeIncidencia(IncidenciaDto datos);
    void deleteIncidencia(Long id);
}
