package lesson_33_Communication_In_Network.homework.runners;

import lesson_33_Communication_In_Network.homework.AbstractClient;

public class Client2 extends AbstractClient implements Runnable {
    @Override
    public void run() {
        this.invoke();
    }

    public static void main(String[] args) {
        new Thread(new Client2()).start();
    }
}
