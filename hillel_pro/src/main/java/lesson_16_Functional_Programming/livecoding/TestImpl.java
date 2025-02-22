package lesson_16_Functional_Programming.livecoding;

public class TestImpl implements TestInterface, TestInterface2 {
    @Override
    public int calculate(int a1, int a2) {
        return a1 + a2;
    }

    @Override
    public String getConstant() {
        return TestInterface2.super.getConstant();
    }

    public static void main(String[] args) {
//        TestImpl sum = new TestImpl();
//        System.out.println(sum.calculate(3, 5));

        // 1 Anonymous class
//        TestInterface sum = new TestInterface() {
//            @Override
//            public int calculate(int a1, int a2) {
//                return a1 + a2;
//            }
//        };
//        sum.calculate(2,5);

        //2 Lambdas
//        TestInterface sum = (int a1, int a2) -> {
//            return a1 + a2;
//        };

        //3 Lambdas
//        TestInterface sum = (a1, a2) -> a1 + a2;

        //4 Lambdas
//        TestInterface sum = (a1,a2) -> Integer.sum(a1,a2);

        //5 Method reference
        TestInterface sum = Integer::sum;
        System.out.println(sum.calculate(4, 6));


    }
}
