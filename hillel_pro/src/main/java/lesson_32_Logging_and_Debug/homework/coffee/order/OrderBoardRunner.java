package lesson_32_Logging_and_Debug.homework.coffee.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderBoardRunner {
    private static final Logger LOGGER = LogManager.getLogger(OrderBoardRunner.class);

    public static void main(String[] args) {
        LOGGER.info("CoffeeOrderBoard has been turned On.");
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        Order order1 = new Order("Bob", "Black Coffee");
        Order order2 = new Order("Alice", "Irish Coffee");
        Order order3 = new Order("Juliet", "Salt-Caramel Latte");

        board.add(order1);
        board.add(order2);
        board.add(order3);

        board.draw();

        System.out.println("Віддали перший за списком: " + board.deliver());

        board.draw();

        System.out.println("Віддали позачергово: " + board.deliver(3));

        board.draw();

        int id = 73;
        board.deliver(id);

        LOGGER.info("End of the program.");
    }
}

/*
2025-04-30 20:23:51,095 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.OrderBoardRunner:10 - CoffeeOrderBoard has been turned On.
2025-04-30 20:23:51,103 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:17 - Queue has been initialized.
2025-04-30 20:23:51,106 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:24 - Trying to add new order into the queue.
2025-04-30 20:23:51,110 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:26 - New order #1 was recently placed on order board.
2025-04-30 20:23:51,110 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:24 - Trying to add new order into the queue.
2025-04-30 20:23:51,110 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:26 - New order #2 was recently placed on order board.
2025-04-30 20:23:51,116 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:24 - Trying to add new order into the queue.
2025-04-30 20:23:51,116 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:26 - New order #3 was recently placed on order board.
2025-04-30 20:23:51,117 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:64 - Providing current state of orderBoard.
2025-04-30 20:23:51,117 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:65 - Method draw() invoked
Order No | Name | Drink
Order #1 | Bob | Black Coffee
Order #2 | Alice | Irish Coffee
Order #3 | Juliet | Salt-Caramel Latte
--------------------
2025-04-30 20:23:51,126 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:34 - Deliver first order in the order queue.
2025-04-30 20:23:51,126 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:35 - poll() recent order from queue
Віддали перший за списком: Order{orderId=1, customerName='Bob', drinkName='Black Coffee'}
2025-04-30 20:23:51,127 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:64 - Providing current state of orderBoard.
2025-04-30 20:23:51,128 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:65 - Method draw() invoked
Order No | Name | Drink
Order #2 | Alice | Irish Coffee
Order #3 | Juliet | Salt-Caramel Latte
--------------------
2025-04-30 20:23:51,128 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:44 - Deliver order out of queue, by it's id.
2025-04-30 20:23:51,128 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:50 - Delete it from the board queue.
2025-04-30 20:23:51,128 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:51 - Remove and return order by id via iterator.hasNext()
Віддали позачергово: Order{orderId=3, customerName='Juliet', drinkName='Salt-Caramel Latte'}
2025-04-30 20:23:51,129 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:64 - Providing current state of orderBoard.
2025-04-30 20:23:51,129 [main] DEBUG lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:65 - Method draw() invoked
Order No | Name | Drink
Order #2 | Alice | Irish Coffee
--------------------
2025-04-30 20:23:51,130 [main] INFO lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:44 - Deliver order out of queue, by it's id.
2025-04-30 20:23:51,130 [main] ERROR lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard:58 - There is no orders matching this id
Exception in thread "main" java.lang.IllegalArgumentException: java.lang.NullPointerException
	at lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard.deliver(CoffeeOrderBoard.java:59)
	at lesson_32_Logging_and_Debug.homework.coffee.order.OrderBoardRunner.main(OrderBoardRunner.java:32)
Caused by: java.lang.NullPointerException
	at lesson_32_Logging_and_Debug.homework.coffee.order.CoffeeOrderBoard.deliver(CoffeeOrderBoard.java:56)
	... 1 more

Process finished with exit code 1

 */