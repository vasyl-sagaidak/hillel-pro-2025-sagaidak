package examples.collections_framework.array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    /*
    .size(); - узнать размер листа.
    .isEmpty(); - узнать пустой или нет. Возвращает булеан значение.
    .add(); - добавить значение в лист.
    .get(); - достать значение из листа.
    .set(int, E) – поместить значение в лист по индексу (с заменой).
    .add(int, E) – добавить значение в лист по индексу (со сдвигом вправо всех значений).
    .remove(E) – удалить значение из листа по индексу.
    .clear(); - удаляет все элементы листа.

    Все эти методы принадлежат интерфейсу List и доступны в любой реализации, будь то LinkedList,
    ArrayList или собственные имплементации интерфейса List.
     */
    public static void main(String[] args) {

      List<Number> arrayList = new ArrayList<>();
      arrayList.add(1);
      arrayList.add(2.2);
      arrayList.add(281231L);
        System.out.println(arrayList.size());
        arrayList.remove(2.2);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Aza");
        linkedList.add("Bob");
        linkedList.add("Carl");
        linkedList.add("Dan");
        linkedList.add("Eve");
        linkedList.add("Fred");

        System.out.println(linkedList.size());

        linkedList.remove("Dan");
    }
}
