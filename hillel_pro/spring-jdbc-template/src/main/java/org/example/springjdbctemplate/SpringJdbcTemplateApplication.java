package org.example.springjdbctemplate;

import org.example.springjdbctemplate.dao.CustomerDao;
import org.example.springjdbctemplate.dto.Customer;
import org.example.springjdbctemplate.dto.Customer;
import org.example.springjdbctemplate.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.security.SecureRandom;

@SpringBootApplication
public class SpringJdbcTemplateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
        SpringApplication.run(SpringJdbcTemplateApplication.class, args);

        //        ########### CLASS WORK ##########

//        UserDao bean = applicationContext.getBean(UserDao.class);

//        for (int i = 0; i < 8; i++) {
//            User user = new User();
//            user.setName("Bob" + i);
//            user.setEmail("bob" + i + "@gnoll.com");
//            bean.add(user);
//        }

//        User byId = bean.getById(4);
//        System.out.println(byId);
//
//        System.out.println(bean.getAll());

//        ########## HOMEWORK #########


        CustomerDao bean = applicationContext.getBean(CustomerDao.class);

        // Cтворення юзерів
        for (int i = 0; i < 7; i++) {
            Customer customer = new Customer();
            customer.setFullName("Java Geek" + i);
            customer.setEmail("javageek" + i + "@oracle.com");
            customer.setSocialSecurityNumber(new SecureRandom().nextInt(Integer.MAX_VALUE));

            bean.add(customer);
        }

        // Пошук за Id
        Customer byId = bean.findById(5);
        System.out.println(byId);

        // Отримання всіх юзерів з таблиці
        System.out.println(bean.getAll());

        // Апдейт юзера
        Customer bilbo = new Customer();
        bilbo.setId(5);
        bilbo.setFullName("Bilbo Baggins");
        bilbo.setEmail("bilbo_adventurer@shire.nz");
        bilbo.setSocialSecurityNumber(918273645);

        int affected = bean.update(bilbo);
        System.out.println("Updated columns: " + affected);

        // Выборка всех пользователей из таблицы после апдейта
        System.out.println(bean.getAll());
    }
}

/*
OUTPUT :

Customer(id=5, fullName=Java Geek4, email=javageek4@oracle.com, socialSecurityNumber=1429758699)

[Customer(id=1, fullName=Java Geek0, email=javageek0@oracle.com, socialSecurityNumber=1721161017),
Customer(id=2, fullName=Java Geek1, email=javageek1@oracle.com, socialSecurityNumber=1695679567),
Customer(id=3, fullName=Java Geek2, email=javageek2@oracle.com, socialSecurityNumber=1055971349),
Customer(id=4, fullName=Java Geek3, email=javageek3@oracle.com, socialSecurityNumber=1143332224),
Customer(id=5, fullName=Java Geek4, email=javageek4@oracle.com, socialSecurityNumber=1429758699),
Customer(id=6, fullName=Java Geek5, email=javageek5@oracle.com, socialSecurityNumber=1643589124),
Customer(id=7, fullName=Java Geek6, email=javageek6@oracle.com, socialSecurityNumber=129965514)]

Updated columns: 1

[Customer(id=1, fullName=Java Geek0, email=javageek0@oracle.com, socialSecurityNumber=1721161017),
Customer(id=2, fullName=Java Geek1, email=javageek1@oracle.com, socialSecurityNumber=1695679567),
Customer(id=3, fullName=Java Geek2, email=javageek2@oracle.com, socialSecurityNumber=1055971349),
Customer(id=4, fullName=Java Geek3, email=javageek3@oracle.com, socialSecurityNumber=1143332224),
Customer(id=6, fullName=Java Geek5, email=javageek5@oracle.com, socialSecurityNumber=1643589124),
Customer(id=7, fullName=Java Geek6, email=javageek6@oracle.com, socialSecurityNumber=129965514),
Customer(id=5, fullName=Bilbo Baggins, email=bilbo_adventurer@shire.nz, socialSecurityNumber=918273645)]

 */
