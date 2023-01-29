package com.raphael.workshopmongo.dto;

import com.raphael.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
