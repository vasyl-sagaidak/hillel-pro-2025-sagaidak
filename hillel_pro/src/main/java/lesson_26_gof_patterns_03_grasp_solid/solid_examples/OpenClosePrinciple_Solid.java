package lesson_26_gof_patterns_03_grasp_solid.solid_examples;

/*
В этом примере класс AreaCalculator способен вычислять общую площадь для любого типа фигур, вне зависимости
от того, какие новые типы фигур будут добавлены в будущем. Это показывает соответствие принципу
открытости/закрытости.
 */

// Абстрактный класс, представляющий фигуру
abstract class OCPShape {
    abstract double area();
}

// Конкретный класс прямоугольника, который расширяет класс фигуры
class Rectangle extends OCPShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Конкретный класс круга, который расширяет класс фигуры
class Circle extends OCPShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Класс, который считает общую площадь фигур
class AreaCalculator {
    public double calculateTotalArea(OCPShape[] shapes) {
        double totalArea = 0;
        for (OCPShape shape : shapes) {
            totalArea += shape.area(); // Вызывается метод area() для каждой фигуры, независимо от типа
        }
        return totalArea;
    }
}
public class OpenClosePrinciple_Solid {
    public static void main(String[] args) {
        OCPShape[] shapes = {new Rectangle(5, 4), new Circle(3)};
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Общая площадь фигур: " + totalArea);
    }
}
