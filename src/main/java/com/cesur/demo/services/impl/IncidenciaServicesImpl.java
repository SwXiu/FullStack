package com.cesur.demo.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesur.demo.models.Incidencia;
import com.cesur.demo.models.dto.IncidenciaDto;
import com.cesur.demo.repositories.IncidenciaRepository;
import com.cesur.demo.services.IncidenciaServices;

@Service
public class IncidenciaServicesImpl implements IncidenciaServices {
    @Autowired
    IncidenciaRepository incidenciaRepository;

    @Override
    public IncidenciaDto getIncidenciaById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenciaById'");
    }

    @Override
    public List<IncidenciaDto> getIncidenceByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceByUserName'");
    }

    @Override
    public void storeIncidencia(IncidenciaDto datos) {
        // TODO Auto-generated method stub
        Incidencia incidencia = new Incidencia();
        incidencia.setDescription(datos.getDescription());
        //incidencia.setPriority(datos.getPriority());
        incidencia.setCreateAlt(LocalDateTime.now());
        incidencia.setPriority(datos.getPriority());
        incidencia.setScope(datos.getscope());
        incidencia.setUserCreated(null);
        incidenciaRepository.save(incidencia);
    }

    @Override
    public void deleteIncidencia(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidencia'");
    }

}
