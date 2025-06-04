package org.example.lesson38homework.dao;

import org.example.lesson38homework.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "Focusrite Usb Soundcard", 399.99));
        products.add(new Product(2, "Gaming Laptop", 1799.0));
        products.add(new Product(3, "Near Field Monitors", 2850.0));
        products.add(new Product(4, "Access Virus TI Polar Synthesizer", 2999.99));
        products.add(new Product(5, "Arturia MidiController", 450.0));
    }

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return new ArrayList<>(products);
    }

    public Optional<Product> findById(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst();
    }

    public void deleteById(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void update(Product updatedProduct) {
        deleteById(updatedProduct.getId());
        add(updatedProduct);
    }
}
