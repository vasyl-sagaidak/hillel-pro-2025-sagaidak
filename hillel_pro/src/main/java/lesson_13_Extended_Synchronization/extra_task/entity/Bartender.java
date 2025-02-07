package lesson_13_Extended_Synchronization.extra_task.entity;

import lesson_13_Extended_Synchronization.extra_task.Status;

public class Bartender implements Runnable {
    private String name;
    private int id;
    private boolean handsIsFree = true;

    public Bartender(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void prepare(Drink drink) {
        if (drink.getStatus().equals(Status.ORDERED) && handsIsFree) {
            drink.setStatus(Status.PREPARATION);
            handsIsFree = false;
            try {
                Thread.sleep(500);
                drink.setStatus(Status.READY);
                handsIsFree = true;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public void run() {

    }
}
