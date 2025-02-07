package lesson_13_Extended_Synchronization.extra_task;

import lesson_13_Extended_Synchronization.extra_task.entity.Bartender;
import lesson_13_Extended_Synchronization.extra_task.entity.Client;

public class App {


    public static void main(String[] args) {
        Client client1 = new Client("William Shakespeare", 1);
        Client client2 = new Client("Vincent Van Gogh", 2);
        Client client3 = new Client("Ernest Hemingway", 3);
        Client client4 = new Client("Jack London", 4);
        Client client5 = new Client("Francis Scott Fitzgerald",5);

        Bartender bartender1 = new Bartender("Bender The Robot",1);
        Bartender bartender2 = new Bartender("Fry The Human", 2);

        new Thread(client1).start();
        new Thread(client2).start();
        new Thread(client3).start();
        new Thread(client4).start();
        new Thread(client5).start();

    }
}
