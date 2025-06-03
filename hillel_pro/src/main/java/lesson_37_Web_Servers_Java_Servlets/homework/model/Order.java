package lesson_37_Web_Servers_Java_Servlets.homework.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Order {
    private int id;
    private LocalDateTime date = LocalDateTime.now();
    private double orderCost;
    private List<Product> products;

    public Order() {
    };

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        orderCost += product.getProductCost();
    }

}
