package lesson_05_Inheritance_Polymorphism.homework;

public class CalcCostBase {

    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}
