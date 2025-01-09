package examples.generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение: " + v);


        Gen<String> strOb = new Gen<String>("Alice");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("Значение: " + s);

        NonGen i = new NonGen(88);
        i.showType();
        int castedIntOb = (Integer) i.getOb();
        System.out.println("Значение " + castedIntOb);

        NonGen str = new NonGen("Bob");
        str.showType();
        String strObj = (String) str.getOb();
        System.out.println("Значение " + strObj);

        i = str;

        // v = (Integer) i.getOb(); // Код скомпилируется, но будет ошибка во время выполнения.

        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generic");
        tgObj.showTypes();
        int t = tgObj.getOb1();
        System.out.println("Value: " + t);

        String vTwoObj = tgObj.getOb2();
        System.out.println("Value: " + vTwoObj);

        Tgnl<Integer, String>  tgtg = new Tgnl<>();
        tgtg.setVal("Test");
        tgtg.setVar(159);

        Integer[] inums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};

        Stats<Integer> stats = new Stats<>(inums);
        double statsSum = stats.average();
        System.out.println("Среднее значение stats равно " + statsSum);

        Stats<Double> statsD = new Stats<>(dnums);
        double statsSumD = statsD.average();
        System.out.println("Среднее значение stats равно " + statsSumD);

        stats.isSameAvg(statsD);

    }
}
