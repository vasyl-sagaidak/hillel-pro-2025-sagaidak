package lesson_24_gof_patterns_01.livecoding_patterns.creational.factory_method;

public class FactoryMethod_Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.createStorage(StorageTypes.DB).store("Store to DB");
        factory.createStorage(StorageTypes.FILE).store("Store to File");
        factory.createStorage(StorageTypes.IN_MEMORY).store("Store to Memory");
    }
}
