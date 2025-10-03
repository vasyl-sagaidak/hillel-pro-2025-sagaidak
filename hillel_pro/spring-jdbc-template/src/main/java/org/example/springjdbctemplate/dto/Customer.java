package org.example.springjdbctemplate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Customer {
    private int id;
    private String fullName;
    private String email;
    private int socialSecurityNumber;

    public Customer() {
    }
}
