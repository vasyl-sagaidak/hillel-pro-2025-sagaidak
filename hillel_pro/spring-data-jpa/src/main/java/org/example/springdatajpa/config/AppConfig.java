package org.example.springdatajpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("org.postgresql.Driver");
        source.setUrl("jdbc:postgresql://127.0.0.1:5432/hillel");
        source.setUsername("postgres");
        source.setPassword("password");
        return source;
    }
}
