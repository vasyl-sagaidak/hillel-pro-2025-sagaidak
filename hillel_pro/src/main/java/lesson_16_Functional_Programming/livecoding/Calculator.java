package lesson_16_Functional_Programming.livecoding;

/*
Пример использования функциональных интерфейсов в качестве
входящих параметров.
 */
public class Calculator {

    // Мы передаем в метод класса Calculator интерфейс и пару знечений,
    // в реализации нашего метода result класса Calculator на интерфейсе вызываем метод
    // calculate и передаем туда параметры, с которыми будем производить операции.
    // Но это все абстрактная структура, так как наш метод calculate интерфейса TestInterface
    // является абстрактным и не имеет конкретной реализации, то-есть на данном этапе мы не знаем
    // какие операци будут производться с нашими данными. Но, когда мы будем передавать в
    // метод result наш функциональный интерфейс (функцию как параметр в этот метод) то, тогда
    // у нас как-раз и будет конкретная логика которая должна буедет отработать на месте.
    // В этом и есть сила функционального программирования.

    int result(TestInterface testInterface, int a, int b) {
        return testInterface.calculate(a,b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Использование функциональных интерфейсов в качестве входяших параметров в методы позволяет
        // нам на лету через лямбды или ссылки на методы предоставлять те или иные реализации
        // нашим абстрактным методам. Это очень сокращает количество кода и предоставляет кучу возможностей.

        System.out.println("As method reference result: " + calculator.result(Integer::sum, 10, 30));

        System.out.println("As lambda result (-): " + calculator.result((a, b) -> a - b, 5, 2));
        System.out.println("As lambda result (+): " + calculator.result((a, b) -> a + b, 5, 2));
        System.out.println("As lambda result (/): " + calculator.result((a, b) -> a / b, 5, 2));
        System.out.println("As lambda result (*): " + calculator.result((a, b) -> a * b, 5, 2));

    }

}