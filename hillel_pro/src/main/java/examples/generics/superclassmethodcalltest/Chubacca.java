package examples.generics.superclassmethodcalltest;

public class Chubacca<T extends Wookie> extends Wookie {
    T instance;

    Chubacca(T instance) {
        this.instance = instance;
    }

    public void speaking() {
        instance.whine();
    }
}
