package com.openclassrooms.webapp.model;

import lombok.Data;

@Data
public class Employee {
    public Integer id;
    private String lastName;
    private String firstName;
    private String mail;
    private String password;

}
