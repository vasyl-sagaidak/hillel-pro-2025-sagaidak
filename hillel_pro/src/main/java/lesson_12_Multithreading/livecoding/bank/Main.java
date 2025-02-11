package lesson_12_Multithreading.livecoding.bank;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account(2000, 1);
        Account account2 = new Account(1000, 2);

        TransferService transferService = new TransferService();

        new Thread(() -> {
            try {
                transferService.transfer(account1, account2, 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        transferService.transfer(account2, account1, 200);
    }
}
