package lesson_09_Generics.livecoding.with_generic;

public class Box <T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public <T> void print(T type) {
        System.out.println(type);
    }
}
