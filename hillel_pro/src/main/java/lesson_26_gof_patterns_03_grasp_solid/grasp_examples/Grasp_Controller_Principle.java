package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*
В данном примере класс UserController является контроллером, обрабатывающим пользовательские запросы. Он
имеет метод createUser, который принимает имя пользователя и создает новый пользовательский объект с помощью
этого имени. Контроллер помогает разделить логику создания пользователя от логики, связанной с вводом данных.
 */

import java.util.Scanner;

// Класс, который представляет собой модель пользователя.
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Класс, который представляет собой контроллер.
class UserController {
    public User createUser(String name) {
        return new User(name);
    }
}

public class Grasp_Controller_Principle {
    public static void main(String[] args) {
        // Создание обьекта контроллера
        UserController controller = new UserController();

        // Создание обьекта Scanner для получения ввода от пользователя
        Scanner scanner = new Scanner(System.in);

        // Считывание имени пользователя от пользователя
        System.out.print("Введіть ім'я користувача: ");
        String userName = scanner.nextLine();

        // Создание пользователя с помощью контроллера
        User user = controller.createUser(userName);

        // Вывод информации про созданного пользователя
        System.out.println("Створений користувач: " + user.getName());
    }
}
