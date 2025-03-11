package lesson_20_Graphs.livecoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QueueMain {
    public static void main(String[] args) {
        // FIFO
        // LIFO (Stack)

        // Имплементации QUEUE:
        // LinkedList
        // ArrayDequeue
        // PriorityQueue
        // LinkedBlockingQueue
//
//        Queue<String> queue = new LinkedList<>();
//        List<String> list = new LinkedList<>();
//

        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        List<Thread> producers = IntStream.range(0, 10).mapToObj(
                i -> new Thread(() -> IntStream.range(0,10)
                        .forEach(n -> queue.add(randomValue())))).collect(Collectors.toList());

        List<Thread> consumers = IntStream.range(0,5).mapToObj(
                i -> new Thread(() -> IntStream.range(0,5)
                        .forEach(n -> System.out.println(queue.poll()))))
                .collect(Collectors.toList());

        producers.forEach(Thread::start);
        consumers.forEach(Thread::start);
    }

    private static Integer randomValue() {
        int min = 0;
        int max = 10000;
        return ThreadLocalRandom.current().nextInt(min, max - 1);
    }
}
