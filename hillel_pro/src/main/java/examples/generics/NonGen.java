package examples.generics;

public class NonGen {
    Object ob;

    public NonGen(Object ob) {
        this.ob = ob;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Типом обьекта является: " + ob.getClass().getName());
    }
}
