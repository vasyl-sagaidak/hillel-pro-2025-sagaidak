package lesson_24_gof_patterns_01.livecoding_patterns.creational.singleton;

public class Singleton_Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
    }
}
