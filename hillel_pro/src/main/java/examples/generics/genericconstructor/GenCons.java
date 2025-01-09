package examples.generics.genericconstructor;

//Использование обобщенного конструктора
public class GenCons {

    private double val;

    public <T extends Number> GenCons(T arg) {
        this.val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("Val: " + val);
    }
}
