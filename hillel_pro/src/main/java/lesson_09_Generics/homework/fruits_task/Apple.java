package lesson_09_Generics.homework.fruits_task;

public class Apple extends Fruit {
    private final float weight;

    public Apple(float weight) {
        this.weight = weight;
    }
    @Override
    float weight() {
        return this.weight;
    }
}
