package lesson_09_Generics.livecoding.with_generic;

public class WithGen {
    public static void main(String[] args) {
        Box<String> str = new Box<String>();
        str.setItem("Any");
        str.setItem("Bob");
        str.setItem("Dave");
        str.setItem("Alice");
    }
}
