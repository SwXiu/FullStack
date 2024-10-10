package com.cesur.demo.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
    // ctrl+shift+alt+Fabajo/Farriba
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username", length = 8)
    private String username;
    @Column(name = "password", length = 16)
    private String password;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "birthday")
    private String birthDate;
    @Column(name = "lastUpdate")
    private LocalDateTime lastUpdate;
    @Column(name = "deletedAlt")
    private LocalDateTime deletedAlt;
    @Column(name = "createAlt")
    private LocalDateTime createAlt;

    // private String document;
    // private EmptyRoleSemantic role;
    public Usuario(Long id, String username, String password, String name, String birthDate, LocalDateTime lastUpdate, LocalDateTime deletedAlt, LocalDateTime createAlt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
