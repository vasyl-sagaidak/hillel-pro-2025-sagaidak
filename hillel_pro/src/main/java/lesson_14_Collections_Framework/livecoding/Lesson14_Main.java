package lesson_14_Collections_Framework.livecoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lesson14_Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

// 1 - перебираем список через фор ич
//        for (String string : list) {
//            System.out.println(string);
//        }

// 2 - перебираем список через итератор
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


// 3 - При попытке найти и удалить элемент через цикл получим исключение потому
//     как это fail-fast подход.

//        for (String s : list) {
//            if (s.equals("C")) {
//                list.remove(s); // Вызовет ConcurrentModificationException
//            }
//        }

// 4 - При попытке найти и удалить элемент используя iterator, у нас все получится, потому как он использует
//     fail-safe подход. Внутри итератора логика работает так что он клонирует коллекцию
//     и работает с ее клоном.

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.equals("C")) {
//                iterator.remove();
//            }
//        }

        //5 Пример использования listIterator
        final ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + " +");
        }

        final ListIterator<String> listIteratorAfterChange = list.listIterator();
        while (listIteratorAfterChange.hasNext()) {
            System.out.println(listIteratorAfterChange.next());
        }
        System.out.println("--------------------");
        // Прохождение fail-safe listIterator для проходки в обратном порядке по списку
        while (listIteratorAfterChange.hasPrevious()) {
            System.out.println(listIteratorAfterChange.previous());
        }

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
    }

    static void benchmark(List<?> list) {
        long startTime = System.nanoTime();
    }
}
