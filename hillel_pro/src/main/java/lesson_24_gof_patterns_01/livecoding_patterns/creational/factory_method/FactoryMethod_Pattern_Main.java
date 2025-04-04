package lesson_24_gof_patterns_01.livecoding_patterns.creational.factory_method;

/*
FACTORY METHOD(ФАБРИЧНЫЙ МЕТОД):
           -> Определяет интерфейс для создания обьекта, но позволяет подклассам решать,
              какой класс инстанцировать. Позволяет делегировать создание обьекта
              подклассам.
 */
public class FactoryMethod_Pattern_Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        factory.createStorage(StorageTypes.DB).store("Store to DB");
        factory.createStorage(StorageTypes.FILE).store("Store to File");
        factory.createStorage(StorageTypes.IN_MEMORY).store("Store to Memory");
    }
}
