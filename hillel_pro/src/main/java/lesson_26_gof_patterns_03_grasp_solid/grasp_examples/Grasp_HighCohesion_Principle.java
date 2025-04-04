package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

import java.util.ArrayList;
import java.util.List;

/*
В этом примере класс PersonalDataManager отвечает за управление персональными данными пользователей и имеет
высокую когерентность, поскольку все его методы связаны с операциями добавления, удаления и получения
пользователей. Класс выполняет конкретную функцию – управление персональными данными – и все его методы
направлены на эту цель.
 */

// Класс для управления личными данными пользователей
class PersonalDataManager {
    private List<String> usernames;
    private List<String> passwords;
    private List<String> emails;

    public PersonalDataManager() {
        usernames = new ArrayList<>();
        passwords = new ArrayList<>();
        emails = new ArrayList<>();
    }

    // Метод для создания нового пользователя
    public void addUser(String username, String password, String email) {
        usernames.add(username);
        passwords.add(password);
        emails.add(email);
    }

    // Метод для удаления пользователя
    public void deleteUser(int index) {
        usernames.remove(index);
        passwords.remove(index);
        emails.remove(index);
    }

    // Метод для получения списка пользователей
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < usernames.size(); i++) {
            users.add("Username: " + usernames.get(i) + ", Email: " + emails.get(i));
        }
        return users;
    }
}

public class Grasp_HighCohesion_Principle {
    public static void main(String[] args) {
        // Создание обьекта для управления личными данными пользователей
        PersonalDataManager manager = new PersonalDataManager();

        // добавление новых пользователей
        manager.addUser("john_doe", "password123", "john_doe@example.com");
        manager.addUser("jane_smith", "password456", "jane_smith@example.com");

        // удаление пользователя
        manager.deleteUser(1);

        // вывод списка пользователей
        List<String> users = manager.getUsers();
        for (String user : users) {
            System.out.println(user);
        }
    }
}
