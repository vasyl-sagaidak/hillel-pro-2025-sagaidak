package lesson_26_gof_patterns_03_grasp_solid.grasp_examples;

/*

 */

// Родительский класс для геометрических фигур
abstract class Shape {
    // Метод для вычисления площади фигуры
    public abstract double calculateArea();
}

// Подкласс круга
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Подкласс прямоугольника
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Grasp_Polymorphism_Principle {
    public static void main(String[] args) {
        // Создание массива геометрических фигур
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);

        // Вывод площади каждой из фигур
        for (Shape shape : shapes) {
            System.out.println("Площа фігури: " + shape.calculateArea());
        }
    }
}
