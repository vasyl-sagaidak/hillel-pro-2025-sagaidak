package examples.generics.genericinterfaces;

/*
Пример обобщенного интерфейса.

Вот общий синтаксис обобщенного интерфейса:
                                                interface interface-name <type-param-list> (

Обобщенный интерфейс предлагает два преимущества. Во-первых, его можно реализовать для разных типов данных.
Во-вторых, он позволяет накладывать ограничения (т.е. границы) на типы данных, для которых может
быть реализован интерфейс. В примере с MinMax в Т могут передаваться только типы, реализующие
интерфейс Comparable.
 */

public interface MinMax <T extends Comparable<T>> {
    T min();
    T max();
}
