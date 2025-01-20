package lesson_08_Exceptions.livecoding.lesson_examp.appvalidator;

// Класс имеющий методы валидации входных данных
public class AppValidator {

    private static final int AGE_LOWER_LIMIT = 18;

    // Метод, который выполняет валидацию значения та обьявляет исключение
    // Валидация возраста. Если возраст меньше определенного количества лет,
    // генерируем исключение ArithmeticException, иначе возвращаем
    // соответствующее сообщение.

    public String validateAge(int age) throws ArithmeticException {
        if (age < AGE_LOWER_LIMIT) {
            //Исключение, выбрасываемое посредством создания обьекта исключения.
            throw new ArithmeticException("Age " + age + " is wrong!");
        } else {
            // Возвращение сообщения при прохождении условий валидации.
            return "Age " + age + " is OK.";
        }
    }
}

class App {
    public static void main(String[] args) {
        // Входящее значение
        int age = 14;
        // Вызов методов обработки входных данных
        getOutput(getResult(age));
        // Последующий код будет выполнен поскольку присутствует обработка исключения.
        getOutput("Some code.");
    }

    private static String getResult(int age) {
        // Обработка исключения через try-catch
        try {
            // Вызов метода, который выполняет валидацию значения
            // и может выбросить исключение
            return new AppValidator().validateAge(age);
        } catch (ArithmeticException e) {
            // Возвращение сообщения об исключении
            return e.getMessage();
        }
    }

    // Вывод результата работы программы
    private static void getOutput(String message) {
        System.out.println(message);
    }
}
