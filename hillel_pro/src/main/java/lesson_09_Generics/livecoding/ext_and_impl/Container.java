package lesson_09_Generics.livecoding.ext_and_impl;

public class Container<T extends Product & Comparable<T>> {
}

class Product {

}

class Camera extends Product implements Comparable<Camera> {


    @Override
    public int compareTo(Camera o) {
        return 0;
    }
}
