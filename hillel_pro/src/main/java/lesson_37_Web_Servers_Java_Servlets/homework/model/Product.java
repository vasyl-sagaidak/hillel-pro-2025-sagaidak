package lesson_37_Web_Servers_Java_Servlets.homework.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Product {
    private int id;
    private String name;
    private double productCost;

    public Product() {
    }
}
