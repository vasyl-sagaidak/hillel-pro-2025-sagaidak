package org.example.lesson38homework.configuration;

import org.example.lesson38homework.Cart;
import org.example.lesson38homework.dao.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }
}
