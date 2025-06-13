package org.example.lesson41homework.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private double price;
    private int orderId; // foreign key
}

//Product