package lesson_05.bonustask;

public class App {

    /*
    В проекті має бути реалізовано функціонал розрахунку базового та оподаткованого доходів.
    Базовий дохід дорівнює рівню продажу (добуток кількості та ціни),
    оподаткований дохід дорівнює різниці між базовим доходом та сумою податку.
    Сума податку дорівнює відсотку базового доходу за ставкою податку.
    Виведення має бути таким:

    Sale: quota is 120 pcs., price is EUR 4.5.
    Revenue is EUR 540.0.
    Sale: quota is 120 pcs., price is EUR 4.5.
    Revenue taxed is EUR 513.0.
     */

    public static void main(String[] args) {

        //Отримуємо вхідні дані
        String[] data = getData();

        //Формуємо об'єкт з вхідних даних
        Sale sale = new Sale(Integer.parseInt(data[0]),
                Double.parseDouble(data[1]));

        //Розраховуємо базовий дохід
        CalcRevenueBase revenueBase = new CalcRevenueBase();
        double baseRevenue = revenueBase.calcRevenue(sale);

        //Розраховуємо дохід з урахуванням податку
        CalcRevenueTaxed calcRevenueTaxed = new CalcRevenueTaxed();
        double taxedRevenue = calcRevenueTaxed.calcRevenue(sale);

        // Формуємо виведення
        String baseOutput = sale + "\nRevenue is " +
                Constants.CURRENCY + " " + baseRevenue + ".";
        String taxedOutput = sale + "\nRevenue taxed is " +
                Constants.CURRENCY + " " + taxedRevenue + ".";

        // Виводимо результат
        getOutput(baseOutput);
        getOutput(taxedOutput);
    }

    //Набір вхідних даних
    public static String[] getData() {
        return new String[] {"120", "4.5"};
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
