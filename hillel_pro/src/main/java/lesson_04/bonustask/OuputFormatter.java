package lesson_04.bonustask;

public class OuputFormatter {
    public String getOutputData(Buyer buyer) {
        return "Buyer: " + buyer.getName() +
                " " + buyer.getSurname()
                + ", phone " + buyer.getPhone();
    }
}
