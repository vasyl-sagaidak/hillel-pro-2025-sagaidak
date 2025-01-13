package examples.generics;

public class Gen<T> {

    T o;

    public Gen(T o) {
        this.o = o;
    }

    public T getOb() {
        return o;
    }

    void showType() {
        System.out.println("Типом Т является " + o.getClass().getName());
    }
}
