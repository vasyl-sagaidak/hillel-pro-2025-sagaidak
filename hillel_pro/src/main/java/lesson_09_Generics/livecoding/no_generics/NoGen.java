package lesson_09_Generics.livecoding.no_generics;

public class NoGen {
    public static void main(String[] args) {
        Box box = new Box();

        box.setItem(Integer.valueOf(10));

        box.setItem(new String("Hello World"));

        Integer i = (Integer) box.getItem();
        System.out.println(i.byteValue());
    }
}
