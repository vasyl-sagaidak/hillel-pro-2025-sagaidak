package lesson_16_Functional_Programming.livecoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //1 Function
        Function<Integer,String> function = String::valueOf;
        System.out.println(function.apply(34));

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add = (value) -> value + 3;

        System.out.println(multiply.apply(2));
        System.out.println(add.apply(30));

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        System.out.println(addThenMultiply.apply(5));

        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
        System.out.println(multiplyThenAdd.apply(5));

        //2 Predicate (always return boolean true/false)

        Predicate<List<Integer>> predicate = List::isEmpty;

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        System.out.println(predicate.test(intList));
        System.out.println(predicate.test(Collections.emptyList()));

        Predicate<List<Integer>> predicate1 = v -> v.contains(1);

        Predicate<List<Integer>> and = predicate.and(predicate1);

        //3 Supplier - gives back the data and nothing more

        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);

        System.out.println(supplier.get());

        //4 Consumer возвращает указанный нами возвращаемый тип

        Consumer<String> consumer = System.out::println;
        consumer.accept("Java is the best programming language");
        consumer.accept("Hillel Java Pro");

    }
}
