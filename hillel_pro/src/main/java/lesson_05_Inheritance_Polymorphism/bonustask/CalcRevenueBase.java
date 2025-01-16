package lesson_05_Inheritance_Polymorphism.bonustask;

// Клас розрахунку базового доходу
public class CalcRevenueBase {

    public double calcRevenue(Sale sale) {
        return sale.getQuota() * sale.getPrice();
    }
}
