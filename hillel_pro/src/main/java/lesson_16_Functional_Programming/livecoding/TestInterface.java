package lesson_16_Functional_Programming.livecoding;

/*
Здесь мы фактически создали свой функциональный интерфейс,
при помощи которого мы уже сделали некоторую его имплементацию
в классе Calculator через лямбды и ссылку на метод.

Это еще одна разновидность полиморфизма: У нас одна имплементация
(метод result(TestInterface testInterface, int a, int b) класса Calculator,
мы ее расширяем интерфейсом и вместо этого интерфейса мы подтягиваем
различные функции.
 */


@FunctionalInterface
public interface TestInterface {
    int calculate(int a, int b);

    default String getConstant() {
        return "I am constant string from TestInterface1";
    }
}

/*
В Java есть пакет java.util.function где имеется огромное количество функциональных интерфейсов
которыми можно пользоваться, и нам не обязательно делать свои имплементации.
Самые распространенные из них: Function, Predicate, Supplier, Consumer.
 */
