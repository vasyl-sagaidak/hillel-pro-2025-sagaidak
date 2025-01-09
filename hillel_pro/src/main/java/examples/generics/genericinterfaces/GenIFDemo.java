package examples.generics.genericinterfaces;

public class GenIFDemo {

    /*
Хотя понимание большинства аспектов в программе не должно вызывать затруднений, необходимо отметить пару
ключевых моментов. Прежде всего, обратите внимание на способ объявления интерфейса MinМax:

interface MinMax<T extends Comparable<T>>

Обобщенный интерфейс объявляется подобно обобщенному классу. В данном случае указан параметр типа Т
с верхней границей Comparable. Как объяснялось ранее, Comparable - это интерфейс, определенный в java.lang,
который задает способ сравнения объектов. Его параметр типа указывает тип сравниваемых объектов.

Затем интерфейс MinMax реализуется классом MyClass. Взгляните на объявление MyClass:

class MyClass<T extends Comparable<T>> implements MinMax<T> {

Обратите особое внимание на то, как параметр типа Т объявляется в MyClass и далее передается классу MinMax.
Поскольку для MinMax требуется тип, который реализует Comparable, реализующий класс (в данном случае
MyClass) должен указывать ту же самую границу. Более того, после установления этой границы нет никакой
необходимости указывать ее снова в конструкции implements.

Вообще говоря, если класс реализует обобщенный интерфейс, то этот класс тоже должен быть обобщенным,
по крайней мере, принимая параметр типа, который передается интерфейсу.

class MyClass implements MinMax<T> { // Ошибка !

Разумеется, если класс реализует специфический тип обобщенного интерфейса, тогда реализующий класс
не обязан быть обобщенным:
class MyClass implements MinMax<Integer> ( // Нормально
     */

    public static void main(String[] args) {
        Integer[] inums = {3,6,2,8,6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Максимальное значение в inums: " + iob.max());
        System.out.println("Минимальное значение в inums: " + iob.min());

        System.out.println("Максимальное значение в chs: " + cob.max());
        System.out.println("Минимальное значение в chs: " + cob.min());
    }
}
