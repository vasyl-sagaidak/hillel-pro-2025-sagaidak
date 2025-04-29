package lesson_29_JDBC.dao;

import lesson_29_JDBC.classwork.dao.StudentDAO;
import lesson_29_JDBC.classwork.dto.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentDAOTest {
    private Connection mockedConnection;
    private PreparedStatement mockedPreparedStatement;
    private Statement mockedStatement;
    private ResultSet mockedResultSet;
    private StudentDAO studentDao;

    @BeforeEach
    void prepareData() {
        mockedConnection = Mockito.mock(Connection.class);
        mockedPreparedStatement = Mockito.mock(PreparedStatement.class);
        mockedStatement = Mockito.mock(Statement.class);
        mockedResultSet= Mockito.mock(ResultSet.class);
        studentDao = new StudentDAO(mockedConnection);
    }

    @Test
    void testAddStudent() throws SQLException {
        // Подготовка общих моков
        Student testStudent
                = new Student("Ben", "103", "TestStudent", 1);
        Mockito.when(mockedConnection.prepareStatement(Mockito.anyString()))
                .thenReturn(mockedPreparedStatement);
        Mockito.when(mockedPreparedStatement.executeUpdate()).thenReturn(1);

        // Проверочное условие по возвращаемому значению из метода add
        assertEquals(1, studentDao.add(testStudent));

        // Верификация
        Mockito.verify(mockedConnection).prepareStatement(Mockito.anyString());
        Mockito.verify(mockedPreparedStatement).setString(1,"Ben");
        Mockito.verify(mockedPreparedStatement).setString(2,"103");
        Mockito.verify(mockedPreparedStatement).setString(3,"TestStudent");
        Mockito.verify(mockedPreparedStatement).setInt(4,1);
        Mockito.verify(mockedPreparedStatement).executeUpdate();
        Mockito.verify(mockedPreparedStatement).close();
    }

    @Test
    void testGetAllStudents() throws SQLException {
        // Подготовка общих моков
        Mockito.when(mockedConnection.createStatement()).thenReturn(mockedStatement);
        Mockito.when(mockedStatement.executeQuery(Mockito.anyString())).thenReturn(mockedResultSet);

        // Подготовка возвратных данных
        Mockito.when(mockedResultSet.next()).thenReturn(true, false);
        Mockito.when(mockedResultSet.getInt("pk_students_id")).thenReturn(1);
        Mockito.when(mockedResultSet.getString("name")).thenReturn("Ben");
        Mockito.when(mockedResultSet.getString("phone_number")).thenReturn("103");
        Mockito.when(mockedResultSet.getString("description")).thenReturn("TestStudent");
        Mockito.when(mockedResultSet.getInt("fk_hillel_group_id")).thenReturn(1);

        // Проверка выборки всех студентов в базе
        List<Student> students = studentDao.getAll();
        assertNotNull(students);
        assertEquals(1, students.size());

        // Проверка студента по полю
        Student student = students.get(0);
        assertEquals(1, student.getId());
        assertEquals("Ben", student.getName());
        assertEquals("103", student.getPhoneNumber());
        assertEquals("TestStudent", student.getDescription());
        assertEquals(1, student.getGroupId());

        // Верификация
        Mockito.verify(mockedConnection).createStatement();
        Mockito.verify(mockedStatement).executeQuery(Mockito.anyString());
        Mockito.verify(mockedResultSet, Mockito.times(2)).next();
        Mockito.verify(mockedResultSet).close();
        Mockito.verify(mockedStatement).close();
    }
}