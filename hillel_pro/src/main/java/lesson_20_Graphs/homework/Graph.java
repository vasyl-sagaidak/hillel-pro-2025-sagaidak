package lesson_20_Graphs.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
private final Map<Integer, List<Integer>> graph = new HashMap<>();

    public void addVertex(int vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
        System.out.println("Add vertex " + vertex);
    }

    public void removeVertex(int vertex) {
        graph.remove(vertex);
        System.out.println("Vertex " + vertex + " has been removed.");
    }

    public void addEdge(int source, int destination) {
        graph.get(source).add(destination);
        graph.get(destination).add(source);
        System.out.println("Add edge between " + source + " and " + destination);
    }

    public void removeEdge(int source, int destination) {
        if (graph.containsKey(source)) {
            graph.get(source).remove(Integer.valueOf(destination));
            System.out.println("Edge link from " + source
                    + " to " + destination + " been removed.");
        } else {
            outputNoVertexSoNoLink(source, destination);
        }
        if (graph.containsKey(destination)) {
            graph.get(destination).remove(Integer.valueOf(source));
            System.out.println("Edge link from " + destination
                    + " to " + source + " been successfully removed.");
        } else {
            outputNoVertexSoNoLink(destination, source);
        }
    }

    private void outputNoVertexSoNoLink(int source, int destination) {
        System.out.println("There is no Vertex " + source
                + ", so there can't be link to " + destination);
    }

    public boolean hasVertex(int vertex) {
        return graph.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        if (graph.containsKey(source) && graph.containsKey(destination)) {
            if (graph.get(source).contains(destination)
                    && graph.get(destination).contains(source)) {
                return true;
            }
        }
        return false;
    }
}
