package lesson_14_Collections_Framework.extra_task;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;

public class BenchmarkService {
    private static final int NUMBER_OF_ELEMENTS = 100_000;
    private static final int SEARCHES = 10_000;
    private static final int REMOVALS = 10_000;;

    private Collection<Integer> collection;
    private Map<Integer, Integer> map;

    public void benchListOrSet(Collection<Integer> collection, String name) {
        this.collection = collection;
        outputHeadline(name);
        insert(collection, name, NUMBER_OF_ELEMENTS);
        search(collection, name, SEARCHES);
        remove(collection, name, REMOVALS);
    }

    public void benchMap(Map<Integer, Integer> map, String name) {
        this.map = map;
        outputHeadline(name);
        insert(map, name, NUMBER_OF_ELEMENTS);
        search(map, name, SEARCHES);
        remove(map, name, REMOVALS);
    }

    public Collection<Integer> getCollection() {
        return collection;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public void insert(Collection<Integer> collection, String name, int numberOfElements) {
        long start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            collection.add(i);
        }
        System.out.println(name + ", insertion time for " + numberOfElements + " elements: "
                + calculateTimeInMs(start) + " ms");
    }

    public void insert(Map<Integer,Integer> map, String name, int numberOfElements) {
        long start = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            map.put(i,i);
        }
        System.out.println(name + ", insertion time for " + numberOfElements + " elements: "
                + calculateTimeInMs(start) + " ms");
    }


    public void search(Collection<Integer> collection, String name, int numberOfSearches) {
        long start = System.nanoTime();
        for (int i = 0; i < numberOfSearches; i++) {
            collection.contains(new SecureRandom().nextInt() * NUMBER_OF_ELEMENTS);
        }
        System.out.println(name + ", search time for " + numberOfSearches + " random searches: "
                + calculateTimeInMs(start) + " ms");
    }

    public void search(Map<Integer,Integer> map, String name, int numberOfSearches) {
        long start = System.nanoTime();
        for (int i = 0; i < numberOfSearches; i++) {
            map.containsKey(new SecureRandom().nextInt() * NUMBER_OF_ELEMENTS);
        }
        System.out.println(name + ", search time for " + numberOfSearches + " random searches: "
                + calculateTimeInMs(start) + " ms");
    }

    public void remove(Collection<Integer> collection, String name, int numberOfRemovals) {
        long start = System.nanoTime();
        for (int i = 0; i < numberOfRemovals; i++) {
            collection.remove((Integer) i);
        }
        System.out.println(name + ", remove time for " + numberOfRemovals + " elements: "
                + calculateTimeInMs(start) + " ms");
        System.out.println();
    }

    public void remove(Map<Integer,Integer> map, String name, int numberOfRemovals) {
        long start = System.nanoTime();
        for (int i = 0; i < numberOfRemovals; i++) {
            map.remove(i);
        }
        System.out.println(name + ", remove time for " + numberOfRemovals + " elements: "
                + calculateTimeInMs(start) + " ms");
        System.out.println();
    }

    private long calculateTimeInMs(long start) {
        long result = System.nanoTime() - start;
        return result / 1_000_000;
    }

    public void outputHeadline(String name) {
        System.out.println("");
        System.out.println(" ===== " + name + " ===== ");
    }
}
