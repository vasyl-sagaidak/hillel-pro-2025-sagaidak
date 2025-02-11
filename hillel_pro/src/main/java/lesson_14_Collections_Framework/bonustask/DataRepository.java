package lesson_14_Collections_Framework.bonustask;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    public List<String> getData() {
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("mouse");
        list.add("fox");
        return list;
    }
}
