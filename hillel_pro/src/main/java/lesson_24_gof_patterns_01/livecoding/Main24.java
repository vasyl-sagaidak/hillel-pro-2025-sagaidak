package lesson_24_gof_patterns_01.livecoding;

import lesson_24_gof_patterns_01.livecoding.creational.factory_method.Factory;
import lesson_24_gof_patterns_01.livecoding.creational.factory_method.StorageTypes;
import lesson_24_gof_patterns_01.livecoding.creational.singleton.Singleton;
import lesson_24_gof_patterns_01.livecoding.creational.singleton.Singleton2;

public class Main24 {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        // Factory Method
        Factory factory = new Factory();
        factory.createStorage(StorageTypes.DB).store("Store to DB");
        factory.createStorage(StorageTypes.FILE).store("Store to File");
        factory.createStorage(StorageTypes.IN_MEMORY).store("Store to Memory");

    }
}
