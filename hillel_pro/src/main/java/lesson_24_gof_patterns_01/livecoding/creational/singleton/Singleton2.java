package lesson_24_gof_patterns_01.livecoding.creational.singleton;

/*
    Здесь имеем подобный вариант, лишь с тем отличием что
    наше статическое поле инстанс типа Синглтон инициализируется
    непосредственно при обьявлении.

    Соответственно статический геттер getInstance() возвращает
    значение поля instance.
 */

public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance() {

        return Singleton2.instance;
    }
}
