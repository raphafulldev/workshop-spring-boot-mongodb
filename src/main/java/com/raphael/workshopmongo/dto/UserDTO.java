package com.raphael.workshopmongo.dto;

import com.raphael.workshopmongo.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserDTO(User obj) {
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
