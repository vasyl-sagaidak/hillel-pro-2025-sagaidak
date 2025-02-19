package lesson_15_Map_Interface.my_hashmap;

public interface MyMap<K, V> {
    void put(K key, V value);

    V getValue(K key);

    int getSize();
}
