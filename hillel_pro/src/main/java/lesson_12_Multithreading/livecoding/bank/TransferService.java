package lesson_12_Multithreading.livecoding.bank;

import java.util.concurrent.TimeUnit;

public class TransferService {

    void transfer(Account account1, Account account2, int amount) throws InterruptedException {
        if (account1.getBalance() < amount) {
            throw new RuntimeException("Can't be sent");
        }
        try {
            System.out.println("Trying to lock " + account1);
            if (account1.getLock().tryLock(100, TimeUnit.MILLISECONDS)) {
                System.out.println(account1 + " was locked");
                Thread.sleep(100);
                System.out.println("Trying to lock " + account2);
                try {
                    if (account2.getLock().tryLock(1000, TimeUnit.MILLISECONDS)) {
                        System.out.println(account2 + " was locked");
                        Thread.sleep(100);
                        account1.withdraw(amount);
                        account2.deposit(amount);
                        System.out.println("Money transfer was successfully");
                    } else {
                        System.out.println("Can't get a lock from " + account2);
                    }
                } finally {
                    if (account2.getLock().isHeldByCurrentThread()) {
                        account2.getLock().unlock();
                    }
                }
            } else {
                System.out.println("Can't get a lock from " + account1);
            }
        } finally {
            if (account1.getLock().isHeldByCurrentThread()) {
                account1.getLock().unlock();
            }
        }
    }
}
