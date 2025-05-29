package lesson_37_Web_Servers_Java_Servlets.homework.model;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private double productCost;

    public Product() {
    }

    public Product(int id, String name, double productCost) {
        this.id = id;
        this.name = name;
        this.productCost = productCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id
                && Double.compare(productCost, product.productCost) == 0
                && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, productCost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
