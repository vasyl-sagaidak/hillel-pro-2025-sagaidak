package lesson_32_Logging_and_Debug.homework.coffee.order;

import lombok.Getter;

@Getter
public class Order {
    private int orderId;
    private String customerName;
    private String drinkName;

    public Order(String name, String drinkName) {
        this.customerName = name;
        this.drinkName = drinkName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", drinkName='" + drinkName + '\'' +
                '}';
    }
}
