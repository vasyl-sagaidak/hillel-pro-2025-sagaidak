package lesson_09_Generics.livecoding.gen_extend;

import java.util.ArrayList;
import java.util.List;

public class AdvancedBox {

    public void sumNumbers(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        AdvancedBox box = new AdvancedBox();

        List<Double> dubList = new ArrayList<Double>();
        dubList.add(1.0);
        dubList.add(2.0);
        dubList.add(3.0);
        dubList.add(4.0);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        box.sumNumbers(dubList);
        box.sumNumbers(intList);
    }
}
