package lesson_05.hometask;

public class CalcCostDelivery extends CalcCostBase {

    private final static double deliveryPrice = Constants.DELIVERY_PRICE;

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}
