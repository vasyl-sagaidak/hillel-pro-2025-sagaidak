package org.example.lesson41homework.mapper;

import org.example.lesson41homework.model.Order;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class OrderMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setId(rs.getInt("id"));
        order.setTotalCost(rs.getDouble("total_cost"));
        order.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime().toLocalDate());
        return order;
    }
}

//OrderMapper