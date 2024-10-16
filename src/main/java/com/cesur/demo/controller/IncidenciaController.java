package com.cesur.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesur.demo.models.dto.IncidenciaDto;
import com.cesur.demo.services.IncidenciaServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class IncidenciaController {

    @Autowired
    IncidenciaServices incidenciaServices;

    @PostMapping("/incidencia")
    public ResponseEntity<Integer> postMethodName(@RequestBody IncidenciaDto entity) {
        return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);
    }

    @PostMapping("/incidencia/:id")
    public ResponseEntity<Integer> addIncidenciaDetail(@PathParam(value="id") IncidenciaDto entity) {
        try {
            incidenciaServices.storeIncidencia(entity);
            return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
        }

    }
}
