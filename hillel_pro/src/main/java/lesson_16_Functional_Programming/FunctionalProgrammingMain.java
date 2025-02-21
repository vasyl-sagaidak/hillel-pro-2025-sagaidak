package lesson_16_Functional_Programming;

public class FunctionalProgrammingMain {
    public static void main(String[] args) {
//        int sum = new TestImpl().calculate(1, 3);
//        System.out.println(sum);

        // Через анонимный класс
//        Functional f = new Functional() {
//            @Override
//            public int calculate(int a1, int a2) {
//                return a1 + a2;
//            }
//        };
//
//        int calc = f.calculate(2, 5);
//        System.out.println(calc);

//      //1
//      Functional sum = (int a1, int a2) -> {
//            return a1+a2;
//        };

        //2
//        Functional som = (int a1, int a2) -> a1 + a2;

        //3
//        Functional sum = (a1,a2) -> a1 +a2;

        //4
//        Functional sum = (a1,a2) -> Integer.sum(a1,a2);

        //5
        Functional sum = Integer::sum;

        System.out.println(sum.calculate(4, 6));


    }
}

@FunctionalInterface
interface Functional {

    int calculate(int a1, int a2);

}

class TestImpl implements Functional {

    @Override
    public int calculate(int a1, int a2) {
        return a1 + a2;
    }
}