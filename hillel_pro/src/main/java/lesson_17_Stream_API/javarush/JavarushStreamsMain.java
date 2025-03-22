package lesson_17_Stream_API.javarush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavarushStreamsMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream<String> stream = list.stream();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Мудрость");
        map.put(2, "Справедливость");
        map.put(3,"Мужество");
        map.put(4, "Умеренность");
        map.put(5, "Честолюбие");


        IntStream.of(50,60,70,80,90,100,110,120).filter(x -> x < 90).map(x -> x+7)
                .limit(3).forEach(System.out::println);

        int[] arr = {50,60,70,80,90,100,110,120};
        int count = 0;
        for (int i : arr) {
            if(i >= 90) {
                continue;
            }
            i+=7;
            count++;
            if (count > 3) {
                break;
            }
            System.out.println(i);
        }

        List<String> collect = map.entrySet().stream().filter(virtue -> !virtue.getValue().contains("Честолюбие"))
                .map(x -> x.getValue().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        //Stream<Integer> streamOfNums = (Stream<Integer>) Arrays.stream(nums);

        String[] arrre = {"Hillel", "Java"};
        Stream<String> streamOfArray = Arrays.stream(arrre);
        streamOfArray.map(s -> s.split(""))
                //.flatMap(Arrays::stream).distinct()
                .map(Arrays::stream).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        String word = Stream.of("H", "e", "l", "l", "o", " ", "J", "a", "v", "a")
                .collect(Collectors.joining("", "[", "]"));
        System.out.println(word);

    }


}
