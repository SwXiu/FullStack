package com.cesur.demo.models.dto;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.cesur.demo.models.utils.Priorities;
import com.cesur.demo.models.utils.Scopes;

public class IncidenciaDto {
    private Long id;
    private String description;
    private Priorities priority;
    private Scopes scope;
    private User userCreated;
    
    public IncidenciaDto(Long id,Scopes scope, String description, Priorities priority, User userCreated) {
        this.id = id;
        this.scope = scope;
        this.description = description;
        this.priority = priority;
        this.userCreated = userCreated;
    }
    

    public Scopes getscope() {
        return scope;
    }

    public void setscope(Scopes scope) {
        this.scope = scope;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priorities getPriority() {
        return priority;
    }

    public void setPriority(Priorities priority) {
        this.priority = priority;
    }

    public User getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    
}
