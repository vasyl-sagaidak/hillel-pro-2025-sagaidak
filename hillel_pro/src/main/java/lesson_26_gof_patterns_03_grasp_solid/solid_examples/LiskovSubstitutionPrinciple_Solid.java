package lesson_26_gof_patterns_03_grasp_solid.solid_examples;

/*
В этом примере классы Rectangle и Square наследуются от базового класса Shape и переопределяют метод
calculateArea(). Классы-наследники могут быть беспроблемно использованы там, где ожидается объект класса
Shape, демонстрирующий соответствие принципа подстановки Лисков.
 */

// Базовый класс для геометрических фигур
class LSPShape {
    public double calculateArea() {
        return 0; // Возвращает нулевую площадь по умолчанию
    }
}

// Класс для прямоугольников
class LSPRectangle extends LSPShape {
    private double width;
    private double height;

    public LSPRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Считает площадь прямоугольника
    }
}

// Класс для квадратов
class Square extends LSPShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side; // Считает площадь квадрата
    }
}

public class LiskovSubstitutionPrinciple_Solid {
    public static void main(String[] args) {
        LSPShape rectangle = new LSPRectangle(5, 4); // Создание прямоугольника
        LSPShape square = new Square(5); // Создание квадрата

        // Вывод площади фигур
        System.out.println("Площа прямокутника: " + rectangle.calculateArea()); // Очікується 20
        System.out.println("Площа квадрата: " + square.calculateArea()); // Очікується 25
    }
}
