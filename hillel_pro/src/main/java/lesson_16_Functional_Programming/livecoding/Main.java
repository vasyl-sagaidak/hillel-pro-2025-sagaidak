package lesson_16_Functional_Programming.livecoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //1 Function<T,R> - это функциональный интерфейс который параметризуется двумя типами, где первый тип, T - то,
        // что мы передаем в метод R apply(T t) интерфейса Function, а R - то что возвращаем из него.

//        Function<Integer, String> function = String::valueOf;
//        System.out.println(function.apply(25));
//
//        Function<Integer, Integer> multiply = (value) -> value * value;
//        System.out.println(multiply.apply(3));
//
//        Function<Integer, Integer> add = value -> value + value;
//        System.out.println(add.apply(43));

        // Существуют default методы которые позволяют делать с нашими данными дополнительные действия,
        // например, у интерфейса Function:

//        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
//        System.out.println(addThenMultiply.apply(2));
//
//        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
//        System.out.println(multiplyThenAdd.apply(10));

        //2 Predicate<T> - функциональный интерфейс который получает на вход какое-то значение, и всегда возвращает
        //  булеан значение true или false.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(231);

        Predicate<List<Integer>> predicate = List::isEmpty;
        System.out.println(predicate.test(Collections.emptyList()));
        System.out.println(predicate.test(list));

        Predicate<List<Integer>> predicate1 = v -> v.contains(1);
        Predicate<List<Integer>> and = predicate.and(predicate1);
        System.out.println(and.test(list));

        //3 Supplier<T> - в саплаере (поставщике) мы просто предоставляем тип который
        // мы должны вернуть через его метод get().
        Supplier<Integer> supplier = () -> (int )(Math.random() * 31);
        System.out.println(supplier.get());

        //4 Consumer<T> - он войдовский, но мы тут делаем дженериком входящий тип.
        Consumer<String> consumer = System.out::println;
        consumer.accept("asdaffg");
        consumer.accept("Gasdjl");
        consumer.accept("Gsgfhad");

        // removeIf & forEach
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        System.out.println(integerList);

        integerList.removeIf(n -> (n % 3 == 0));
        integerList.forEach(System.out::println);

        // ComputeIfPresent & ComputeIfAbsent
        Map<Integer, List<String>> map = new HashMap<>();
        map.computeIfAbsent(1, s -> {
            List<String> list1 = new ArrayList<>();
            list1.add("tttt");
            return list1;
        });

        map.computeIfAbsent(2, s -> {
            List<String> list1 = new ArrayList<>();
            list1.add("ttttrrrrr");
            return list1;
        });
        System.out.println(map);

        map.computeIfPresent(1, (key,value) -> {
            value.add("tatatatat");
            return value;
        });

        System.out.println(map);
    }
}
