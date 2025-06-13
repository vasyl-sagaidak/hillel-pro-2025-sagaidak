package org.example.lesson41homework.mapper;

import org.example.lesson41homework.model.Product;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setPrice(rs.getDouble("price"));
        product.setName(rs.getString("name"));
        product.setOrderId(rs.getInt("fk_order_id"));
        return product;
    }
}

//ProductMapper