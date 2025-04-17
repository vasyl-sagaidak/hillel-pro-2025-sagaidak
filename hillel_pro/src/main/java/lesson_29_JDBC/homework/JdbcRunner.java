package lesson_29_JDBC.homework;

import lesson_29_JDBC.homework.dao.EmployeeDAO;
import lesson_29_JDBC.homework.dto.Employee;
import lesson_29_JDBC.homework.utils.DatabaseConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JdbcRunner {
    public static void main(String[] args) throws SQLException {

        Connection connection = DatabaseConnector.getConnection();
        EmployeeDAO dao = new EmployeeDAO(connection);

        Employee developer = new Employee("Chuck", 30, "Developer", 5000);
        Employee hr = new Employee("Betina", 24, "HRManager", 2000);

        dao.addEmployee(developer);
        dao.addEmployee(hr);

        List<Employee> all = dao.getAllEmployees();
        all.forEach(System.out::println);

        dao.updateEmployee(1, 5500);
        dao.deleteEmployee(2);


        System.out.println("After update and delete:");
        dao.getAllEmployees().forEach(System.out::println);
    }
}

/* OUTPUT:

Employee{id=7, name='Chuck', age=30, position='Developer', salary=5000.0}
Employee{id=8, name='Betina', age=24, position='HRManager', salary=2000.0}
After update and delete:
Employee{id=7, name='Chuck', age=30, position='Developer', salary=5000.0}
Employee{id=8, name='Betina', age=24, position='HRManager', salary=2000.0}

Process finished with exit code 0
 */
