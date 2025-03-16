package lesson_21_Annotations_Reflection.livecoding;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Context {

    public static final Map<String, Object> MAP = new HashMap<>();

    public Object getBean(String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName(name);
        if (aClass.isAnnotationPresent(Autowire.class)) {
            Constructor<?> constructor = aClass.getConstructor(null);
            Object o = constructor.newInstance(null);
            MAP.put(name, o);
            return o;
        }
        throw new ClassNotFoundException(String.format("Class with name %s wasn't found", name));
    }
}
