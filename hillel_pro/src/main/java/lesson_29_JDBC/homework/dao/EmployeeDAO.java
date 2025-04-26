package lesson_29_JDBC.homework.dao;

import lesson_29_JDBC.homework.dto.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private final Connection connection;

    public EmployeeDAO(Connection connection) {
        this.connection = connection;
    }

    public int addEmployee(Employee employee) throws SQLException {
   try(PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employees " +
           "(name, age, position, salary) VALUES (?,?,?,?)")) {
    preparedStatement.setString(1, employee.getName());
    preparedStatement.setInt(2, employee.getAge());
    preparedStatement.setString(3,employee.getPosition());
    preparedStatement.setDouble(4,employee.getSalary());
       return preparedStatement.executeUpdate();
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";
        try (Statement statement = connection.createStatement()) {
            try(ResultSet resultSet = statement.executeQuery(sql)) {
                while(resultSet.next()) {
                    employees.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("position"),
                        resultSet.getDouble("salary")));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public void updateEmployee(int id, double newSalary) {
        try (PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE employees SET salary = ? WHERE id = ?")) {
            preparedStatement.setDouble(1,newSalary);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(int id) {
        try (PreparedStatement preparedStatement = connection
                .prepareStatement("DELETE FROM employees WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
