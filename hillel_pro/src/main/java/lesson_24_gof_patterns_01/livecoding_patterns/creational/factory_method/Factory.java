package lesson_24_gof_patterns_01.livecoding_patterns.creational.factory_method;

public class Factory {

    public DataStorage createStorage(StorageTypes type) {
        switch (type) {
            case DB:
                return new DBStorage();
            case FILE:
                return new InFileStorage();
            case IN_MEMORY:
                return new InMemoryStorage();
        }
        throw new RuntimeException("Didn't found file");
    }
}
