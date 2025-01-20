package lesson_08_Exceptions.livecoding.lesson_examp;



public class FinallyBlockMain {
    public static void main(String[] args) {
        //  finallyBlockWrongHandle();
       finallyBlockCorrectHandle();
    }

    public static void finallyBlockWrongHandle() {
        // Код выбрасывает исключение, но блок catch не в состояниии его обработать.
        // Несмотря на это, блок finally выполняется после блока try,
        // а потом программа завершается аварийно.
        try {
            System.out.println("In try block.");

            //Код выбрасывает исключение
            int result = 15 / 0;
            //Код не будет выполнен
            System.out.println("Result is: " + result);
        }
        // catch не может обработать ArithmeticException
        // который необходим.
        // Может принимать только NullPointerException/

        // catch (Exception e) {
        catch (NullPointerException e) {
            // Сообщение об исключении
            System.out.println(e.getMessage());
        }
        // Выполняется независимо от наличия исключения.
        finally {
            System.out.println("Finally block.");
        }
        // Последующий блок не будет выполнен, поскольку присутствует
        // несоответствующая обработка исключения
        System.out.println("Some code.");
    }

    public static void finallyBlockCorrectHandle() {
        // Код генерирует исключение в блоке try, блок catch обрабатывает исключение
        // Позднее, блок finally используется после блока try-catch.
        // Дальше остальной код также выполняется нормально.
        try {
            System.out.println("In try block.");
            //Код выбрасывает исключение
            int result = 15 / 0;
            //Код не будет выполнен
            System.out.println("Result is: " + result);
        }
        // Верная обработка ArithmeticException, деления на ноль.
        catch (ArithmeticException e) {
            // Сообщение об исключении
            System.out.println("Exception: "
                    + e.getMessage());
        }
        // Выполняется независимо от наличия исключения.
        finally {
            System.out.println("Finally block.");
        }
        // Последующий код будет выполнен, поскольку присутствует
        // правильная обработка исключения.
        System.out.println("Some code.");

    }


}
