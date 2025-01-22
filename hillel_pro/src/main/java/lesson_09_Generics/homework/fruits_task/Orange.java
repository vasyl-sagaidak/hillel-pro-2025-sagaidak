package lesson_09_Generics.homework.fruits_task;

public class Orange extends Fruit {
    private final float weight = 1.5F;

    @Override
    float weight() {
        return this.weight;
    }
}
