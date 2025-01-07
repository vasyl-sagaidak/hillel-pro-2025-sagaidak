package bonus_tasks.lesson04_bonustask;

public class OuputFormatter {
    public String getOutputData(Buyer buyer) {
        return "Buyer: " + buyer.getName() +
                " " + buyer.getSurname()
                + ", phone " + buyer.getPhone();
    }
}
