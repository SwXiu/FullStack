package com.cesur.demo.models.dto;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class IncidenciaDto {
    private Long id;
    private String category;
    private String description;
    private String priority;
    private User userCreated;
    
    public IncidenciaDto(Long id,String category, String description, String priority, User userCreated) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.userCreated = userCreated;
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
