package lesson_37_Web_Servers_Java_Servlets.homework;

import lesson_37_Web_Servers_Java_Servlets.homework.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    private int id;
    private final LocalDateTime date = LocalDateTime.now();
    private double orderCost;
    private final List<Product> products;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        orderCost += product.getProductCost();
    }

}
