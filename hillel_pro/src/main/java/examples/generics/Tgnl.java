package examples.generics;

public class Tgnl<K,V> {
    K var;
    V val;

    public void setVal(V val) {
        this.val = val;
    }

    public V getVal() {
        return val;
    }

    public void setVar(K var) {
        this.var = var;
    }

    public K getVar() {
        return var;
    }
}
