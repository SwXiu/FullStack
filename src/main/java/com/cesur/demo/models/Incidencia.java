package com.cesur.demo.models;

import java.time.LocalDateTime;

import com.cesur.demo.models.utils.Priorities;
import com.cesur.demo.models.utils.Scopes;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incidencia")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Incidencia {   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String description;
    @Enumerated(EnumType.STRING)
    private Priorities priority;
    @Enumerated(EnumType.STRING)
    private Scopes Scope;
    @Column
    private LocalDateTime createAlt;
    @Column
    @Nullable
    private LocalDateTime updateAlt;
    @Column
    @Nullable
    private LocalDateTime deleteAlt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuario userCreated;

}
