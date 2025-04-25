package lesson_31_Unit_Testing.classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    private MathOperationService mathOperationService
            = Mockito.mock(MathOperationService.class);

    private MathOperationService mathOperationServiceSpy =
            Mockito.spy(MathOperationService.class);

    private Calculator calculator;

    @BeforeEach
    public void prepareData() {
        calculator = new Calculator(mathOperationService);
    }

    @Test
    public void testSumNumbers() {
        assertEquals(2, calculator.add(1,1));
    }

    @Test
    public void testDivNumbers() {
        assertEquals(1, calculator.div(1,1));
    }

    // Тест-метод, пример по ожидаемому исключению, true если бросает.
    @Test
    public void testDivToZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.div(1,0);
        });
    }

    // Тест-метод, пример использования Mock.
    @Test
    public void testExternalOperation() {
        Mockito.when(mathOperationService.operation(Mockito.anyInt(),Mockito.anyInt())).thenReturn(6);
        assertEquals(12, calculator.externalOperation(2,2));
    }

    // Тест-метод, пример использования Spy.
    @Test
    public void testExternalOperationSpy() {
        calculator = new Calculator(mathOperationServiceSpy);
        // можем его не мокать и тогда он пойдет в депенденсю/сторонний сервис и возьмет там данные,
        // а можем замокать и тогда он вернет мок.
       // Mockito.when(mathOperationService.operation(Mockito.anyInt(),Mockito.anyInt())).thenReturn(6);
        assertEquals(10, calculator.externalOperation(2,2));
        // Тестирование войдовских методов.
        Mockito.verify(mathOperationServiceSpy, Mockito.times(1))
                .operation(Mockito.anyInt(), Mockito.anyInt());
    }



}