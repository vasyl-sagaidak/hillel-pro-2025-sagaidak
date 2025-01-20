package lesson_08_Exceptions.livecoding.lesson_examp;


public class AgeValidationExampleMain {
    public static final int AGE_LOWER_LIMIT = 18;

    public static void main(String[] args) {
        // ageValidationNoHandle();
        ageValidationHandled();
    }

    public static void ageValidationNoHandle() {
    // Проверка возраста.
    // Если возраст меньше определенного количества лет, генерируем
    // исключение ArithmeticException, иначе выводим соответствующее сообщение.
    // Код метода генерирует непроверяемое исключение ArithmeticException,
    // потому метод должен обработать исключение (здесь, не обрабатывается).

        // Входные данные
    int age = 14;
    // Вызов методов обработки входных данных
    getOutput(validateAgeNoHandle(age));
    // Последующий код не будет выполнен, если валидация не пройдена.
        System.out.println("Some code.");
    }

    public static void ageValidationHandled() {
        // Проверка возраста.
        // Если возраст меньше определенного количества лет, генерируем
        // исключение ArithmeticException, иначе выводим соответствующее сообщение.
        // Код метода генерирует непроверяемое исключение ArithmeticException,
        // потому метод должен обработать исключение (здесь, обрабатывается).

        // Входные данные
        int age = 14;
        // Вызов методов обработки входных данных
        getOutput(validateAgeHandled(age));
        // Последующий код не будет выполнен, если валидация не пройдена.
        System.out.println("Some code.");
    }

    // Метод, который выполняет валидацию входных данных и не обрабатывает исключение
    public static String validateAgeNoHandle(int age) throws RuntimeException {
        if (age < AGE_LOWER_LIMIT) {
            // Исключение, которое выбрасывается через создание обьекта исключения
            throw new ArithmeticException("Age is too low");
        } else {
            // Сообщение при прохождении условий валидации
            return "Age is OK!";
        }
    }

    public static String validateAgeHandled(int age) throws RuntimeException {
        try {
            if (age < AGE_LOWER_LIMIT) {
                throw new ArithmeticException("Age is too low");
            }
        } catch (ArithmeticException e) {
            return "Age is OK!";
        } finally {
            return "Age is OK!";
        }
    }

    // Вывод результата работы программы
    public static void getOutput(String output) {
        System.out.println(output);
    }
}
