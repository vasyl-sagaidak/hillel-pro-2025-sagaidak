package lesson_24_gof_patterns_01.livecoding_patterns.creational.singleton;

/*
    Идея Синглтона в том, что бы в нашем приложении был только один его инстанс.
    Этого добиваемся обьявляя:
     1. приватный пустой конструктор.
     2. Пустое статическое поле-ссылку инстанса типа синглтон.
     3. Статический геттер getInstance() с проверкой инстанса на null, и в случае матча, присвоение
        new Singleton() полю-инстансу.
     4. Возвращаем инстанс синглтона из метода getInstance().

     Cоздание Singleton руками в проекте считается bad practice, и он считается антипаттерном.
     В основном это делается при помощи библиотек, фреймворков, надстроек. Лучше использовать
     синглтон инстансы (bean's) используя фреймворки типа Spring или Micronaut..

 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
