package lesson_04_OopGeneralConcepts.bonustask;

public class OuputFormatter {
    public String getOutputData(Buyer buyer) {
        return "Buyer: " + buyer.getName() +
                " " + buyer.getSurname()
                + ", phone " + buyer.getPhone();
    }
}
