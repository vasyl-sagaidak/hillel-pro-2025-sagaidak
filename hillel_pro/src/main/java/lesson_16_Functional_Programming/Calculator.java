package lesson_16_Functional_Programming;

public class Calculator {
    int result(Functional functional, int a1, int a2) {
        return functional.calculate(a1,a2);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
//        c.result(Integer::sum, 5, 46);
        int result = c.result((a1, a2) -> a1 * a2, 5, 10);
        System.out.println(result);
    }
}

