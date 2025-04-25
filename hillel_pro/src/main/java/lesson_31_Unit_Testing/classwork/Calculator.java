package lesson_31_Unit_Testing.classwork;

public class Calculator {
    private MathOperationService mathOperationService;

    public Calculator(MathOperationService mathOperationService) {
        this.mathOperationService = mathOperationService;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int neg(int a, int b) {
        return a - b;
    }

    public int externalOperation(int a, int b) {
        return mathOperationService.operation(a, b) * 2;
    }
}
