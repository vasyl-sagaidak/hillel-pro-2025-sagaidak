package lesson_16_Functional_Programming.livecoding;

@FunctionalInterface
public interface TestInterface {
    int calculate(int a1, int a2);

    default String getConstant() {
        return "I am constant string";
    }
}
