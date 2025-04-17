package lesson_29_JDBC.classwork.dao;

import java.util.List;
import java.util.ArrayList;
import lesson_29_JDBC.classwork.dto.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DAO = Data Access Object
public class StudentDAO {
    private Connection connection;

    public StudentDAO(Connection connection) {
        this.connection = connection;
    }

    public int add(Student student) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students" +
                "(name, phone_number, description, fk_hillel_group_id) VALUES (?, ?, ?, ?)")) {
           preparedStatement.setString(1, student.getName());
           preparedStatement.setString(2, student.getPhoneNumber());
           preparedStatement.setString(3,student.getDescription());
           preparedStatement.setInt(4, student.getGroupId());
            return preparedStatement.executeUpdate();
        }
    }

    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        try(Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
                while(resultSet.next()) {
                    students.add(new Student(
                            resultSet.getInt("pk_students_id"),
                            resultSet.getString("name"),
                            resultSet.getString("phone_number"),
                            resultSet.getString("description"),
                            resultSet.getInt("fk_hillel_group_id")));
                }
                return students;
            }
        }
    }
}
