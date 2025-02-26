package lesson_16_Functional_Programming.livecoding;

public interface TestInterface2 {

    default String getConstant() {
        return "I am string from interface 2";
    }
}
