package lesson_24_gof_patterns_01.livecoding_patterns.creational.singleton;

/*
SINGLETON(ОДИНОЧКА):
           -> Гарантирует, что класс имеет только один экземпляр и предоставляет
              глобальную точку доступа к нему.
 */

public class Singleton_Pattern_Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
    }
}
