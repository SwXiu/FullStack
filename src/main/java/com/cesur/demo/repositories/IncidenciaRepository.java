package com.cesur.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesur.demo.models.Incidencia;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Long>{

}
