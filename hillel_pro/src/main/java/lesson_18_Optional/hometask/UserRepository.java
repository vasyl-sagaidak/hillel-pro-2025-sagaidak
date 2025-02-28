package lesson_18_Optional.hometask;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepository {
    private final List<User> users;

    public UserRepository() {
        this.users = Arrays.asList(
                new User(1, "Bob", "b@gmail.com"),
                new User(2, "Alice", "a@gmail.com"),
                new User(3, "John", "j@gmail.com"),
                new User(4, "Helen", "h@gmail.com"),
                new User(5, "Marc", "m@gmail.com"),
                new User(6, "Tom", "t@gmail.com"),
                new User(7, "Kate", "k@gmail.com")
        );
    }

    public List<User> getUsers() {
        return users;
    }

    public Optional<User> findUserById(int id) {
        // повертає Optional<User> з користувачем за вказаним id
            List<User> filtered = users.stream()
                    .filter(o -> (o.getId() == id))
                    .collect(Collectors.toList());

            if (filtered.isEmpty()) {
                System.out.println("User with id=[" + id +"] doesn't exist.");
                return Optional.empty();
            }
            return Optional.ofNullable(filtered.get(0));
    }

    public Optional<User> findUserByEmail(String email) {
        // повертає Optional<User> з користувачем за вказаною електронною поштою.
        List<User> filtered = users.stream()
                .filter(e -> e.getEmail().equals(email))
                .collect(Collectors.toList());

        if (filtered.isEmpty()) {
            System.out.println("User with email=[" + email + "] doesn't exist.");
            return Optional.empty();
        }
            return Optional.ofNullable(filtered.get(0));
    }

    public Optional<List<User>> findAllUsers(List<User> list) {
        return Optional.ofNullable(list);
    }

// 3.Створіть методи, щоб продемонструвати різні сценарії використання Optional:
    public void getUserById(int id) {
        // a. Пошук користувача за id. Перевірте, чи знайдений користувач присутній,
        //   і виведіть інформацію про нього, якщо він є.
        findUserById(id).ifPresent(System.out::println);
    }

    public void getUserByEmail(String email) {
        // b. Пошук користувача за email. Перевірте, чи знайдений користувач присутній,
        //   і виведіть інформацію про нього, якщо він є.
        findUserByEmail(email).ifPresent(System.out::println);
    }

    public int getPresentListUsersQuantity(List<User> list) {
        // c. Отримання списку всіх користувачів. Перевірте, чи список користувачів присутній,
        //  і виведіть кількість користувачів у списку.
       if (findAllUsers(list).isPresent()) {
           return findAllUsers(list).get().size();
       }
        return 0;
    }
}
