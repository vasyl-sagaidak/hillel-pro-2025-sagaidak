package lesson_09_Generics.homework.fruits_task;

public class Orange extends Fruit {
    private final float weight;

    public Orange(float weight) {
        this.weight = weight;
    }

    @Override
    float weight() {
        return this.weight;
    }
}
