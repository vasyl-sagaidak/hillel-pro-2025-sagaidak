package lesson_05.bonustask;

// Клас розрахунку базового доходу
public class CalcRevenueBase {

    public double calcRevenue(Sale sale) {
        return sale.getQuota() * sale.getPrice();
    }
}
