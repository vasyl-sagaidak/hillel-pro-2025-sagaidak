package lesson_13_Extended_Synchronization.extra_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BarApp {
    public static void main(String[] args) throws InterruptedException {
        Bar moesBar = new Bar();
        List<Thread> workers = new ArrayList<>();
        for (int i = 1; i <=2 ; i++) {
            workers.add(new Thread(new Bartender(i,moesBar)));
        }

        List<Thread> clients = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            Thread.sleep(300);
            clients.add(new Thread(new Client(i,moesBar)));
        }

        for (Thread worker : workers) {
            worker.start();
        }

        for (Thread client : clients) {
            client.start();
        }
    }
}
