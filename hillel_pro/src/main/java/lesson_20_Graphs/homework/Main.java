package lesson_20_Graphs.homework;

public class Main {
    public static void main(String[] args) {

        // Создаем инстанс Графа
        Graph graph = new Graph();

        // добавляем вершины в Граф
        graph.addVertex(1); // A
        graph.addVertex(2); // B
        graph.addVertex(3); // C
        graph.addVertex(4); // D

        System.out.println(" ---- ");

        // Проверяем метод hasVertex и выводим результат его работы в консоль:
        System.out.println("Has vertex 1: " + graph.hasVertex(1));
        System.out.println("Has vertex 2: " + graph.hasVertex(2));
        System.out.println("Has vertex 3: " + graph.hasVertex(3));
        System.out.println("Has vertex 4: " + graph.hasVertex(4));

        System.out.println(" ---- ");

        // Добавляем ребра между вершинами:
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        System.out.println(" ---- ");

        // Проверяем наличие ребер:
        System.out.println("Has edge between 1 and 2: " + graph.hasEdge(1, 2));
        System.out.println("Has edge between 1 and 3: " + graph.hasEdge(1, 3));
        System.out.println("Has edge between 2 and 3: " + graph.hasEdge(2, 3));
        System.out.println("Has edge between 2 and 4: " + graph.hasEdge(2, 4));
        System.out.println("Has edge between 3 and 4: " + graph.hasEdge(3, 4));

        System.out.println(" ---- ");

        // Удаляем ребро между вершинами 2 и 4.
        graph.removeEdge(2,4);

        System.out.println(" ---- ");

        // Удаляем вершину 4
        graph.removeVertex(4);

        System.out.println(" ---- ");

        // Повторно проверяем наличие вершин
        System.out.println("Has vertex 1: " + graph.hasVertex(1));
        System.out.println("Has vertex 2: " + graph.hasVertex(2));
        System.out.println("Has vertex 3: " + graph.hasVertex(3));
        System.out.println("Has vertex 4: " + graph.hasVertex(4));

        System.out.println(" ---- ");

        // Повторно проверяем наличие ребер:
        System.out.println("Has edge between 1 and 2: " + graph.hasEdge(1, 2));
        System.out.println("Has edge between 1 and 3: " + graph.hasEdge(1, 3));
        System.out.println("Has edge between 2 and 3: " + graph.hasEdge(2, 3));
        System.out.println("Has edge between 2 and 4: " + graph.hasEdge(2, 4));
        System.out.println("Has edge between 3 and 4: " + graph.hasEdge(3, 4));

        System.out.println(" ---- ");

        // Удаляем ребро между вершинами 3 и 4, в результате получим удаление
        // записи о связи с вершиной 4 у вершины 3.
        graph.removeEdge(3,4);
    }
}

/*
ВЫВОД В КОНСОЛЬ СЛЕДУЮЩИЙ:

Add vertex 2
Add vertex 3
Add vertex 4
 ----
Has vertex 1: true
Has vertex 2: true
Has vertex 3: true
Has vertex 4: true
 ----
Add edge between 1 and 2
Add edge between 1 and 3
Add edge between 2 and 3
Add edge between 2 and 4
Add edge between 3 and 4
 ----
Has edge between 1 and 2: true
Has edge between 1 and 3: true
Has edge between 2 and 3: true
Has edge between 2 and 4: true
Has edge between 3 and 4: true
 ----
Edge link from 2 to 4 been removed.
Edge link from 4 to 2 been successfully removed.
 ----
Vertex 4 has been removed.
 ----
Has vertex 1: true
Has vertex 2: true
Has vertex 3: true
Has vertex 4: false
 ----
Has edge between 1 and 2: true
Has edge between 1 and 3: true
Has edge between 2 and 3: true
Has edge between 2 and 4: false
Has edge between 3 and 4: false
 ----
Edge link from 3 to 4 been removed.
There is no Vertex 4, so there can't be link to 3

 */
