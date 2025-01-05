package examples.patterns.generating_type.builder_pattern.ma_example;

/*
                Создание ПОРОЖДАЮЩЕГО паттерна БИЛДЕР!
1) Задаем поля внешнего класса (описываем его состояние).
2) Создаем статический вложенный класс Builder и дублируем все поля внешнего класса в нем.
3) Создаем по экземпляру специфического метода "сеттеро/геттера" на каждое поле билдера,
   который возвращает обьект билдера, при этом, инициализуя переменную класса как сеттер.
4) Создаем метод build(), возвращающий новый обьект внешнего класса с
        ключевым словом this в качестве параметра в конструкторе.
5) Создаем конструктор внешнего класса, cвязывающий поля внешнего класса
    с полями билдера, который данный конструктор принимает на вход в качестве параметра.
6) Создаем статический метод builder() для грациозности. Благодаря ему упраздняем необходимость писать через new:
                                = new Car.Builder().withMake("Toyota").build();
    и теперь можем пиать так:
                                = Car.builder().withMake("Toyota").build();
 */

public class Car {
    // 1) Задаем поля внешнего класса (описываем его состояние).
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private int horsePower;

    /* 5) создаем конструктор внешнего класса, cвязывающий поля внешнего класса
    с полями билдера, который данный конструктор принимает на вход в качестве параметра. */

    public Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engine = builder.engine;
        this.horsePower = builder.horsePower;
    }

    /* 6) Создаем статический метод builder() для грациозности.
    Благодаря ему упраздняем необходимость писать через new:
                                = new Car.Builder().withMake("Toyota").withModel("Corolla").build();
    и теперь можем пиать так:
                                = Car.builder().withMake("Toyota").withModel("Corolla").build();
     */
    public static Builder builder() {
        return new Builder();
    }

    /* 2) Создаем статический вложенный класс Builder
         и дублируем все поля внешнего класса в нем. */

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private String engine;
        private int horsePower;

    /* 3) Создаем по экземпляру специфического метода "сеттеро/геттера"
        * на каждое поле билдера, который возвращает обьект билдера,
        * при этом, инициализуя переменную класса как сеттер.  */

        public Builder withMake(String make) {
            this.make = make;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withYear(int year) {
            this.year = year;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder withHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

    /* 4) Создаем метод билд, возвращающий новый обьект внешнего класса с
        ключевым словом this. */

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
