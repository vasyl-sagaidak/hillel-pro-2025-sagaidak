package lesson_29_JDBC.classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Здесь через рефлексию вызываем необходимый драйвер
        // (для каждой базы данных: MySql/PostgreSQL/etc он свой).
        Class.forName("org.postgresql.Driver");

        // Это креденшиалы которые нужны для коннекта к базе
        String url = "jdbc:postgresql://127.0.0.1:5432/hillel";
        String login = "postgres";
        String password = "password";

        // 1) DriverManager возвращает нам инстанс коннекшна
        try (Connection connection = DriverManager.getConnection(url, login, password)) {
            // 2) Из коннекшна мы создаем инстанс стейтмента
            try(Statement statement = connection.createStatement()) {
                // 3) В стейтмент заворачиваем наш запрос в базу данных, и из него получаем наш resultSet
                try(ResultSet resultSet = statement.executeQuery("SELECT * FROM students")) {
                    while(resultSet.next()) {
                        System.out.println("pk_students_id " + resultSet.getInt("pk_students_id"));
                        System.out.println("name " + resultSet.getString("name"));
                        System.out.println("phone_number " + resultSet.getString("phone_number"));
                        System.out.println("description " + resultSet.getString("description"));
                        System.out.println("fk_hillel_group_id " + resultSet.getInt("fk_hillel_group_id"));
                    }
                }
            }
            // DDL операции проводятся через стейтмент, DML через преперед стейтмент!
            try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students " +
                    "(name, phone_number, description, fk_hillel_group_id) VALUES (?, ?, ?, ?)")) {
                preparedStatement.setString(1, "Dmytro");
                preparedStatement.setString(2, "3215124");
                preparedStatement.setString(3, "student Dmytro looking forward ORM");
                preparedStatement.setInt(4, 1);
                System.out.println(preparedStatement.executeUpdate());
            }
        }
    }
}
