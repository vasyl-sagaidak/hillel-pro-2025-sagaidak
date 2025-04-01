package lesson_25_gof_patterns_02.livecoding_patterns.structural.flyweight;

public class Flyweight_Main {
    public static void main(String[] args) {
        Shape shape = ShapeFlyweightFactory.getShape("Red");
        shape.draw(1,2);

        Shape shape1 = ShapeFlyweightFactory.getShape("Green");
        shape.draw(5,3);

        Shape shape2 = ShapeFlyweightFactory.getShape("Black");
        shape.draw(2,8);

        Shape shape3 = ShapeFlyweightFactory.getShape("Red");
        shape.draw(1,2);
    }
}
