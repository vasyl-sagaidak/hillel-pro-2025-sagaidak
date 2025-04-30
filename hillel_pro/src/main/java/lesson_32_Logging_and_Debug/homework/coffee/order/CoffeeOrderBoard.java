package lesson_32_Logging_and_Debug.homework.coffee.order;

import lesson_24_gof_patterns_01.homework.LoggerRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private static final Logger LOGGER = LogManager.getLogger(CoffeeOrderBoard.class);
    private int orderCounter;
    private Queue<Order> orderQueue;

    public CoffeeOrderBoard() {
        LOGGER.info("Queue has been initialized.");
        orderQueue = new LinkedList<>();
    }

    public boolean add(Order order) {
        if (order != null) {
            order.setOrderId(++orderCounter);
            LOGGER.debug("Trying to add new order into the queue.");
            orderQueue.add(order);
            LOGGER.info("New order #" + orderCounter +  " was recently placed on order board.");
            return true;
        }
        return false;
    }

    public Order deliver() {
        try {
            LOGGER.info("Deliver first order in the order queue.");
            LOGGER.debug("poll() recent order from queue");
            return orderQueue.poll();
        } catch (NullPointerException e) {
            LOGGER.error("Order Board is empty.", e);
            throw new RuntimeException("Orderboard is empty.");
        }
    }

    public Order deliver(int id) {
        LOGGER.info("Deliver order out of queue, by it's id.");
    Iterator<Order> iterator = orderQueue.iterator();
    while (iterator.hasNext()) {
        Order current = iterator.next();
        if (current.getOrderId() == id) {
            iterator.remove();
            LOGGER.info("Delete it from the board queue.");
            LOGGER.debug("Remove and return order by id via iterator.hasNext()");
            return current;
        }
    }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            LOGGER.error("There is no orders matching this id");
            throw new IllegalArgumentException(e);
        }
    }

    public void draw() {
        LOGGER.info("Providing current state of orderBoard.");
        LOGGER.debug("Method draw() invoked");
        System.out.println("Order No | Name | Drink");
        orderQueue.forEach(o -> {
            System.out.println("Order #"+ o.getOrderId()
                    + " | " + o.getCustomerName()
                    + " | " + o.getDrinkName());
        });
        System.out.println("--------------------");
    }
}
