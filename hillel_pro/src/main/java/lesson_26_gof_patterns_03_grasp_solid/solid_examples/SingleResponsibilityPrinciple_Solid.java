package lesson_26_gof_patterns_03_grasp_solid.solid_examples;

import java.util.List;

/*
В этом примере класс UserDataStorageAndDisplay нарушает принцип SRP, поскольку он отвечает как за сохранность
объектов, так и за их отображение. После перепроектирования класс был разделен на два отдельных класса:
UserDataStorage, отвечающий за сохранность пользователей, и UserDisplay, отвечающий за их отображение.
*/

// Пример класса, нарушающего принцип SRP, поскольку он отвечает как за
// сохранность объектов, так и за их отображение
class UserDataStorageAndDisplay {
    private List<User> users;

    public void saveUser(User user) {
        // Логика сохранения пользователя в БД
    }

    public void displayUsers() {
        // Логика отображения списка пользователей в консоли
    }
}

// Перепроектированный класс, отвечающий исключительно за сохранение пользователей
class UserDataStorage {
    private List<User> users;

    public void saveUser(User user) {
        // Логика сохранения пользователя в БД
    }
}

// Класс, отвечающий исключительно за отображение пользователей
class UserDisplay {
    private List<User> users;

    public void displayUsers() {
        // Логика отображения списка пользователей в консоли
    }
}

class User{}

public class SingleResponsibilityPrinciple_Solid {

}
