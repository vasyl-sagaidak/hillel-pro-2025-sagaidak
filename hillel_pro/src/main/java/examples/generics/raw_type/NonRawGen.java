package examples.generics.raw_type;

public class NonRawGen <T> {
    T instance;

    NonRawGen(T instance) {
        this.instance = instance;
    }

    public T getInstance() {
        return instance;
    }

}
