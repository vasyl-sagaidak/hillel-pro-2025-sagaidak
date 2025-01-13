package lesson_06.livecoding;

public class Demo {
    //Ежегодный бонус в виде фиксированного количества денежных едениц
    private static final int BONUS = 300;

    public static void main(String[] args) {
        //Создание обтекта Работника с определенными входными данными
        Employee emp = new Employee("Tom", "seller", 2000);
        //Количество отработанных лет
        int workedYears = 4;

        Demo demo = new Demo();
        demo.handleSalary(emp, workedYears);
        demo.changePosition(emp, "manager");
        //Выведение информации после обработки данных
        System.out.println("Employee: "
                + emp.getName() + ", position is: "
                + emp.getPosition() + ", salary in EUR: "
                + emp.getSalary());
    }

    //Обработка данных о зароботной плате
    public void handleSalary(Employee employee, int wrkYrs) {
        int totalBonus = wrkYrs * BONUS;
        int newSalary = employee.getSalary() + totalBonus;
        employee.setSalary(newSalary);
    }

    //Обработка данных о должности
    public void changePosition(Employee employee, String position) {
        employee.setPosition(position);
    }
}
