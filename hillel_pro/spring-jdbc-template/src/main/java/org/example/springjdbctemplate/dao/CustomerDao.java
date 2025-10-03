package org.example.springjdbctemplate.dao;

import lombok.AllArgsConstructor;
import org.example.springjdbctemplate.dto.Customer;
import org.example.springjdbctemplate.mapper.CustomerMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CustomerDao {

    JdbcTemplate jdbcTemplate;

    public void add(Customer customer) {
        String insertSql = "INSERT INTO customers (full_name, email, social_security_number) VALUES (?,?,?)";
    jdbcTemplate.update(insertSql, customer.getFullName(), customer.getEmail(),
            customer.getSocialSecurityNumber());
    }

    public Customer findById(int id) {
        String selectSql = "SELECT * FROM customers WHERE id=?";
        return jdbcTemplate.queryForObject(selectSql, new CustomerMapper(), id);
    }

    public int update(Customer customer) {
        String updateSql = "UPDATE customers SET full_name=?, email=?, social_security_number=? WHERE id=?";
        return jdbcTemplate.update(
                updateSql,
                customer.getFullName(),
                customer.getEmail(),
                customer.getSocialSecurityNumber(),
                customer.getId()
        );
    }

    public int delete(Customer customer) {
        String deleteSql = "DELETE FROM customers WHERE id=?";
        return jdbcTemplate.update(deleteSql, customer.getId());
    }

    public List<Customer> getAll() {
        String selectSql = "SELECT * FROM customers";
        return jdbcTemplate.query(selectSql, new BeanPropertyRowMapper<>(Customer.class));
    }
}
