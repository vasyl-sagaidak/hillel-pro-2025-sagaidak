package org.example.lesson41homework.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Product {
    private int id;
    private String name;
    private double price;
}
