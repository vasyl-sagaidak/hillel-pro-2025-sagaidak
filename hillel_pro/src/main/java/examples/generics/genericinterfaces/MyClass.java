package examples.generics.genericinterfaces;

//Реализовать интерфейс MinMax

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {
        this.vals = o;
    }

    //Возвратить минимальное значение в vals.
    @Override
    public T min() {
    T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    //Возвратить максимальное значени в vals.
    @Override
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }

}
