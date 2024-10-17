package com.cesur.demo.models;

import java.time.LocalDateTime;

import com.cesur.demo.models.utils.Roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
    // ctrl+shift+alt+Fabajo/Farriba
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "password", length = 32)
    private String password;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "active")
    private String active;
    @Column(name = "lastUpdate")
    private LocalDateTime lastUpdate;
    @Column(name = "deletedAlt")
    private LocalDateTime deletedAlt;
    @Column(name = "createAlt")
    private LocalDateTime createAlt;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol", nullable = false)
    private Roles rol;

    // private String document;
    // private EmptyRoleSemantic role;
    public Usuario(Long id, String email, String password, String name, String active, LocalDateTime lastUpdate, LocalDateTime deletedAlt, LocalDateTime createAlt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.active = active;
        this.lastUpdate = lastUpdate;
        this.deletedAlt = deletedAlt;
        this.createAlt = createAlt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public LocalDateTime getDeletedAlt() {
        return deletedAlt;
    }

    public void setDeletedAlt(LocalDateTime deletedAlt) {
        this.deletedAlt = deletedAlt;
    }

    public LocalDateTime getCreateAlt() {
        return createAlt;
    }

    public void setCreateAlt(LocalDateTime createAlt) {
        this.createAlt = createAlt;
    }

    

}
