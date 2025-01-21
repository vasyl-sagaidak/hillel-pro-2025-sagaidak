package lesson_09_Generics.homework.fruits_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> fruitsBox;

    public Box() {
        fruitsBox = new ArrayList<T>();
    }

    public List<T> getBox() {
        return fruitsBox;
    }

    public void add(T fruit) {
       fruitsBox.add(fruit);
   }

   public void add(T[] fruits) {
       fruitsBox.addAll(Arrays.asList(fruits));
   }

   public float getWeight() {
           return fruitsBox.isEmpty() ? 0.0F :
                   fruitsBox.get(0).weight() * fruitsBox.size();
   }

   public boolean compare(Box<? extends Fruit> box) {
        return this.fruitsBox.equals(box.fruitsBox);
   }

   public void merge(Box<T> box) {
        if (box.fruitsBox != null) {
            this.fruitsBox.addAll(box.fruitsBox);
        } else {
            throw new IllegalArgumentException("Box can't be null");
        }
   }
}
