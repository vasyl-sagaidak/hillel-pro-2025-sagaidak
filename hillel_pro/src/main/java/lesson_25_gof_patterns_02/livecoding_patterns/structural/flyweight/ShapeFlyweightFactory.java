package lesson_25_gof_patterns_02.livecoding_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFlyweightFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String color) {
        Shape shape = shapes.get(color);
        if (shape == null) {
            shape = new Circle(color);
            shapes.put(color,shape);
            System.out.println("Creating a new " + color + " circle.");
        }
        return shape;
    }
}
