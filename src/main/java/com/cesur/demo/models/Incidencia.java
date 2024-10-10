package com.cesur.demo.models;

import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "incidencia")

public class Incidencia {   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String category;
    @Column
    private String description;
    @Column
    private String priority;
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
    public Incidencia() {}

    public Incidencia(Long id, String category, String description, String priority, LocalDateTime createAlt, LocalDateTime updateAlt, LocalDateTime deleteAlt, Usuario userCreated) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.createAlt = createAlt;
        this.updateAlt = updateAlt;
        this.deleteAlt = deleteAlt;
        this.userCreated = userCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreateAlt() {
        return createAlt;
    }

    public void setCreateAlt(LocalDateTime createAlt) {
        this.createAlt = createAlt;
    }

    public LocalDateTime getUpdateAlt() {
        return updateAlt;
    }

    public void setUpdateAlt(LocalDateTime updateAlt) {
        this.updateAlt = updateAlt;
    }

    public LocalDateTime getDeleteAlt() {
        return deleteAlt;
    }

    public void setDeleteAlt(LocalDateTime deleteAlt) {
        this.deleteAlt = deleteAlt;
    }

    public Usuario getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Usuario userCreated) {
        this.userCreated = userCreated;
    }


}
