package lesson_16_Functional_Programming.livecoding;

public class TestImpl implements TestInterface, TestInterface2{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    @Override
    public String getConstant() {
        return TestInterface2.super.getConstant();
    }

    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        System.out.println(test.calculate(3, 5));

        // Реализация через Анонимный класс
        TestInterface sum = new TestInterface() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sum.calculate(3, 5));

        // Через лямбду 1
        TestInterface divide = (int a, int b) -> {
            return a / b;
        };
        System.out.println(divide.calculate(100, 5));

        // Через лямбду 2 (более коротко).
        TestInterface multi = (a, b) -> a * b;
        System.out.println(multi.calculate(5, 2));

        // Через вызов статичного метода 1
        TestInterface lamImp = (a,b) -> Integer.sum(a,b);

        // Через метод референс
        /*
        Метод референс может быть создан на 4 типа:
        - Статические методы
        - Методы экземпляра конкретных обьектов
        - Методы экземпляра произвольного обьекта определенного типа
        - Конструктор

        Метод референс позволяет нам в лямбде сослаться одним из 4 видов референса на метод
        имеющий идентичные входящие параметры и ту или иную готовую конкретную реализацию.
        Здесь, учитывая что у нашего функционального интерфейса TestInterface имеется метод
        calculate с двумя входящими параметрами, и у класса Integer имеется реализованный
        метод sum с идентичными входящими параметрами и уже готовой логикой опаерации суммирования,
        то мы в нашей лямбде через метод-референс ссылаемся на конкретную реализацию.
         */
        TestInterface methRef = Integer::sum;
        TestInterface pow = Math::max;
        System.out.println(pow.calculate(5, 2));

    }
}
