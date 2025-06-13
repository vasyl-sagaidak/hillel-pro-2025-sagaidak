package org.example.lesson41homework.repository;

import lombok.AllArgsConstructor;
import org.example.lesson41homework.mapper.OrderMapper;
import org.example.lesson41homework.mapper.ProductMapper;
import org.example.lesson41homework.model.Order;
import org.example.lesson41homework.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class OrderRepository {

    private final JdbcTemplate jdbcTemplate;
    private final OrderMapper orderRowMapper;
    private final ProductMapper productRowMapper;

    public void save(Order order) {
        jdbcTemplate.update(
                "INSERT INTO orders (id, total_cost, created_at) VALUES (?,?,?)",
                order.getId(), order.getTotalCost(), order.getCreatedAt()
        );
        for (Product product : order.getProducts()) {
            jdbcTemplate.update(
                    "INSERT INTO product (name, price, fk_order_id) VALUES (?,?,?)",
                    product.getName(), product.getPrice(), order.getId()
            );
        }
    }

    public List<Order> findAll() {
       List<Order> orders =
               jdbcTemplate.query("SELECT * FROM orders", orderRowMapper);
       List<Product> allProducts = jdbcTemplate.query(
               "SELECT * FROM product", productRowMapper
       );

       Map<Integer, List<Product>> grouped = allProducts.stream()
               .collect(Collectors.groupingBy(Product::getOrderId));

       for (Order order : orders) {
           List<Product> products = grouped.getOrDefault(order.getId(), new ArrayList<>());
           order.setProducts(products);
       }

       return orders;
    }

    public Order findById(int id) {
        Order order = jdbcTemplate.queryForObject(
                "SELECT * FROM orders WHERE id=?",
                orderRowMapper, id
        );

        List<Product> products = jdbcTemplate.query(
                "SELECT * FROM product WHERE product.fk_order_id = ?",
                productRowMapper, id
        );

        order.setProducts(products);

        return order;
    }

    public void deleteById(int id) {
        jdbcTemplate.update( "DELETE FROM orders WHERE id = ?", id);
    }

    public void update(Order order) {
        jdbcTemplate.update(
                "UPDATE orders SET total_cost = ?, created_at = ? WHERE id = ?",
                order.getTotalCost(), order.getCreatedAt(), order.getId()
        );

        jdbcTemplate.update(
                "DELETE FROM product WHERE product.fk_order_id = ?", order.getId()
        );

        for (Product product : order.getProducts()) {
            jdbcTemplate.update(
                    "INSERT INTO product (name, price, fk_order_id) VALUES (?,?,?)",
                    product.getName(), product.getPrice(), product.getOrderId()
            );
        }
    }

    public boolean existsById(int id) {
        Integer count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM orders WHERE id = ?",
                Integer.class, id
        );
        return count != null && count > 0;
    }

}

//DAO Repo