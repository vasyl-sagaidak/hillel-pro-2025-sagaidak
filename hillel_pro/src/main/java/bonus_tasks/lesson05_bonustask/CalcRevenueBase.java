package bonus_tasks.lesson05_bonustask;

// Клас розрахунку базового доходу
public class CalcRevenueBase {

    public double calcRevenue(Sale sale) {
        return sale.getQuota() * sale.getPrice();
    }
}
