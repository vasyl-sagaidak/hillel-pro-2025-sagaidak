package lesson_17_Stream_API.livecoding;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMain {
    public static void main(String[] args) {

        // Способы создания стрима с нуля

//1 - Пустой стрим при помощи Stream.empty()
//        Stream<Integer> stream = Stream.empty();

//2 - Стрим из коллекции при помощи collection.stream()
//        Collection<String> collection = Arrays.asList("3", "d", "232");
//        Stream<String> stream = collection.stream();

//3 - Cтрим из произвольных данных при помощи Stream.of()
//        Stream<String> f = Stream.of("f", "dDFf", "Df", "Df");

//4 - Стрим из массива при помощи Arrays.stream()
//        String[] arr = new String[]{"d", "d", "df"};
//        Stream<String> stream = Arrays.stream(arr);

//5 - Стрим из билдера при помощи паттерна builder()
        Stream<String> build = Stream.<String>builder().add("ddf").add("fas").add("kksz").build();

        // Практичные примеры работы со стримами
        // Статический метод iterate() позволяет проитерироваться через стрим, и при этом эту итерацию
        // проапгрейдить функцией.
        Stream<Integer> stream = Stream.iterate(40, n -> n + 2).limit(20);
        System.out.println(stream.collect(Collectors.toList()));
//
        List<String> list = new ArrayList<>();
        list.add("12");
        list.add("21");
        list.add("33");

        list.forEach(System.out::println);

// Метод filter самый популярный у стримов.
        Stream<String> stringStream = list.stream().filter(element -> element.contains("1"))
                .filter(element -> element.contains("2"));
        System.out.println(stringStream.collect(Collectors.toList()));

// Метод map второй по популярности.
        List<String> uris = new ArrayList<>();
        uris.add("hillel_pro/src/main/java/resources/my-NIO-file.txt");

        // Пример превращения листа стрингов в сет путей в одну строку при помощи стрима
//        Set<Path> collect = uris.stream().map(Paths::get).collect(Collectors.toSet());

    /*
    Имеется класс Car содержащий List<Passenger> лист пассажиров которые мы передаем через конструктор,
    пример того, как при помощи стримов мы можем манипулировать внутренними листами.
    Пример удобства того как мы можем через стримы удобно манипулировать внутренними листами
     */

        // Представим что у нас есть лист автомобилей
        List<Car> cars = new ArrayList<>();

        // Мы можем представить автомобиль как список пассажиров находящихся в нем
        List<List<Passenger>> collect1 = cars.stream().map(Car::getPassengerList).collect(Collectors.toList());
        // то-есть при помощи стрима мы получаем доступ к каким то коллекциям, каким то внутренним элементам в
        // одну строку.

        // Имеем три листа с разными значениями (это просто пример что бы показать каким образом
        // работают методы стрима), так же как собственно и в примере с автомобилем
        List<Integer> primeNumbers = Arrays.asList(5,7,11,13);
        List<Integer> oddNumbers = Arrays.asList(1,3,5);
        List<Integer> evenNumbers = Arrays.asList(2,4,6);

        // Здесь мы можем склеить эти листы в некое подобие матрицы, тоесть это лист листов.
        // Иерархия, имеется коллекция обьектов и каждый обьект имеет свою внутреннюю коллекцию.
        final List<List<Integer>> lists = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
        System.out.println(lists);

        // Может быть так что нам необходимо представить эту иерархию в одноуровневом виде,
        // что нам на каком-то этапе совершенно не нужна эта многоуровневая структура и мы
        // можем захотеть слить всю эту многоуровневую структуру в одну плоскость.
        // Бывает так что вот у нас есть множество каких то моделей, в них коллекции, какие-то элементы,
        // и вот эта иерархия есть а нам требуется собрать эти элементы из множества и отправить в какую то
        // таблицу в базе данных. И вместо того, что бы ходить к каждой из наших моделей, собирать эти данные,
        // потом создавать какую то коллекцию, каждый раз с каждого обхода добавлять в коллекцию эти элементы
        // и потом эту коллекцию отправлять в базу данных, мы можем сделать это через стримы, и супер легко.

        List<Integer> collect = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

        // Пример того как быстро морфануть лист в мапу при помощи стрима и что-то сделать с данными там,
        // и потом дальше пробросить лист.

        Map<Integer, List<Passenger>> collect2 = cars.stream().collect(Collectors.toMap(Car::getId, Car::getPassengerList));

        // В результате ряда нехитрых манипуляций мы сформировали мапу у которой ключ это айди автомобиля,
        // а велью - список пассажиров.

        // пример детерминованных каскадных операций, которые возвращают стрим:
        List<List<Passenger>> collect3 = collect1.stream()
                .skip(2)
                .limit(4)
                .distinct()
                .collect(Collectors.toList());

        // пример терминованных операций на примере anyMatch, allMatch, noneMatch
        final boolean b = uris.stream().anyMatch(element -> element.contains("1"));
        final boolean a = uris.stream().allMatch(element -> element.contains("1"));
        final boolean c = uris.stream().noneMatch(element -> element.contains("1"));

        // Пример того, что при помощи можно решать разнообразные арифметические задачи, у стримов много методов
        // доступных на различные ситуации в практике. Рекомендовано посмотреть что вообще есть в стримах.
        // Функциональные интерфейсы и стримы очень облегчили жизнь разработчиков и позволили быстрее и проще
        // реализовать те же вещи что и раньше.

        List<Integer> integers =  Arrays.asList(1,1,1,1);
        Integer reduce = integers.stream()
                .reduce(23, (e, d) -> e + d);
        System.out.println(reduce);
    }
}
