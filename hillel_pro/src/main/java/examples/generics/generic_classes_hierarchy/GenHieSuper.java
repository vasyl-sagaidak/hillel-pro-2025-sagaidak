package examples.generics.generic_classes_hierarchy;

public class GenHieSuper<T> {
    T ob;

    GenHieSuper(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }

    public static void main(String[] args) {
        GenHieChild<Integer> num = new GenHieChild<Integer>(100);
    }
}

class GenHieChild<T> extends GenHieSuper<T> {
    GenHieChild(T o) {
        super(o);
    }
}
