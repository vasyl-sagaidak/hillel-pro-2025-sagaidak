package lesson_29_JDBC.classwork;

import lesson_29_JDBC.classwork.dao.StudentDAO;
import lesson_29_JDBC.classwork.dto.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/hillel";
        String login = "postgres";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, login, password)) {
            StudentDAO studentDAO = new StudentDAO(connection);

            studentDAO.add(new Student("Robin", "999988", "Robin is new Student", 3));

            System.out.println(studentDAO.getAll());
        }
    }
}
