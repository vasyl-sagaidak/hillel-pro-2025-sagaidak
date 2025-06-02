package lesson_37_Web_Servers_Java_Servlets.homework.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Order {
    private int id;
    private final LocalDateTime date = LocalDateTime.now();
    private double orderCost;
    private final List<Product> products;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

}
