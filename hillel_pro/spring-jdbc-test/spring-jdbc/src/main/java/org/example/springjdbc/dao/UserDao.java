package org.example.springjdbc.dao;

import lombok.AllArgsConstructor;
import org.example.springjdbc.dto.User;
import org.example.springjdbc.mapper.UserMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserDao {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void add(User user) {
        jdbcTemplate.update("INSERT INTO users (name, email) " +
                "VALUES (?,?)", user.getName(), user.getEmail());
    }

    public User getById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE id=?", new UserMapper(), id);
    }

    public List<User> getAll() {
        return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
    }

    public User getNamed(int id, String name) {
        SqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("id", id)
                .addValue("name", name);

       return namedParameterJdbcTemplate
               .queryForObject("SELECT * FROM users", namedParameters, User.class);
    }
}
