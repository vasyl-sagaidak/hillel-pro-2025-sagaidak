package lesson_15_Map_Interface.lms_bonustask;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {
    public Map<String, String> getData() {
        Map<String, String> animalsMap = new HashMap<>();
        animalsMap.put("dog17", "Dog");
        animalsMap.put("cat55","Cat");
        animalsMap.put("mos34","Mouse");
        animalsMap.put("fox41","Fox");
        return animalsMap;
    }
}
