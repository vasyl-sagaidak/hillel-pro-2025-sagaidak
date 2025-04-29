package lesson_30_JPA_and_Hibernate.homework;

import lesson_30_JPA_and_Hibernate.homework.dao.HomeworkDao;
import lesson_30_JPA_and_Hibernate.homework.dao.StudentDao;
import lesson_30_JPA_and_Hibernate.homework.dto.Homework;
import lesson_30_JPA_and_Hibernate.homework.dto.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class HibernateRunner {
    public static void main(String[] args) {
      SessionFactory sessionFactory =
              new Configuration().configure("hibernate_homework.cfg.xml")
              .buildSessionFactory();

        StudentDao studentDao = new StudentDao(sessionFactory);

        Student std = new Student();
        std.setFirstName("Pablo");
        std.setLastName("Escobar");
        std.setEmail("medelin.cartel@columbia.com");

        Student std2 = new Student();
        std2.setFirstName("Nicolo");
        std2.setLastName("Tesla");
        std2.setEmail("ether@inthe.air");

        Student std3 = new Student();
        std3.setFirstName("Sergey");
        std3.setLastName("Rachmaninoff");
        std3.setEmail("great-rachmaninoff@genius.com");

        studentDao.save(std);
        System.out.println("Студент збережений" + std);

        studentDao.save(std2);
        System.out.println("Студент збережений" + std2);

        studentDao.save(std3);
        System.out.println("Студент збережений" + std3);

        HomeworkDao homeworkDao = new HomeworkDao(sessionFactory);

        Homework hw = new Homework();
        hw.setDescription("Навчитись працювати з Hibernate");
        hw.setDeadLine(LocalDate.now().plusDays(5));
        hw.setMark(0);
        hw.setStudent(std);

        homeworkDao.save(hw);
        System.out.println("Домашнє завдання збережене" + hw);

        hw.setMark(5);
        homeworkDao.update(hw);
        System.out.println("Домашнє завдання оновлено" + hw);

        List<Student> studentList = studentDao.findAll();
        System.out.println("Усі студенти:");
        studentList.forEach(System.out::println);

        sessionFactory.close();
    }
}
