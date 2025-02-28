package lesson_18_Optional.livecoding;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLivecodingMain {
    public static void main(String[] args) {

        // Case 1 - Пример создания опшинала через of,
        // если обьект не пустой то будет обьект,
        // если пустой то NullPointerException
        Optional<String> case1 = Optional.of("Non empty");
        //Optional<String> optionalOf = Optional.of(null);

        if (case1.isPresent()) {
            System.out.println(case1.get());
        }

        // Case 2 - Пример создания опшинала через ofNullable
        // если обьект не пустой то будет обьект,
        // если пустой то будет пустой обьект, но при помощи метода orElse
        // мы можем вернуть какой-то другой дефолтный обьект
        String s = null;
        Optional<String> case2 = Optional.ofNullable(s);
        System.out.println(case2.orElse("Other object"));


        // Case 3 - при помощи метода ifPresent можно использовать более
        // функциональный вариант то тут на вход в метод используется
        // Consumer, если что-то есть, то будем производить с ним действия по
        // Сonsumer, если ничего, то ничего не делаем.
        Optional<String> case3 = Optional.of("Case 3");
        case3.ifPresent(x -> System.out.println(x.toUpperCase()));

        // Case 4 - вот более модерновый пример, мы можем на опшинале
        // вызывать методы стрима.
        // Мы сохраняем обьект в опшинале и при этом
        // можем с ним что-то делать на лету используя методы стрима.
        Optional<String> case4 = Optional.of("Case 4");
        System.out.println(case4.map(String::toUpperCase));

        // Case 5 - пример использования статичного метода empty класса Optional.
        // а так-же пример использования метода .orElseGet(),
        // который на вход принимает саплаер.
        // Сапплаер это функциональный интерфейс имеющий метод get(),
        // тоесть он ничего не принимает, и только возвращает указанное в функции.
        // Та-же можно использовать метод orElse() который возвращает
        // просто указанное значение а не через лямбду как orElseGet().
        Optional<String> case5 = Optional.empty();
        String result = case5.orElseGet(() -> "bla bla bla");
        //String result = case5.orElse("I am a strict value");
        System.out.println(result);

        // Case 6 - при помощи метода orElseThrow() проверяем есть ли у нас обьект
        // если есть, вернем обьект, если нет то выбросим исключение переданное
        // через Supplier как параметр в orElseThrow().
        Optional<String> case6 = Optional.of("Case 6");
        //Optional<String> case6 = Optional.empty();
        String result1 = case6.orElseThrow(() -> new RuntimeException("Немає"));
        System.out.println(result1);

        // Case 7 - есть возможность из обьекта через flatMap вернуть какое-то поле,
        // в данном конкретном примере из обьекта User возвращаем опшинал содержащий
        // имя пользователя в строковом представлении. И уже после мы можем его дальше
        // процессить методами опшинала.
        Optional<User> user = Optional.of(new User("John"));
        Optional<String> optional = user.flatMap(User::getName);
        System.out.println(optional);
    }

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public Optional<String> getName() {
            return Optional.ofNullable(name);
        }
    }
}
