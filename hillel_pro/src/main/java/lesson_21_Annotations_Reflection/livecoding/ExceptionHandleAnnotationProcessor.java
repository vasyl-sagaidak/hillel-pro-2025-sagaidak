package lesson_21_Annotations_Reflection.livecoding;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExceptionHandleAnnotationProcessor {

    private Context context;

    public ExceptionHandleAnnotationProcessor(Context context) {
        this.context = context;
    }

    public void handle(Class<?> aClass) {
        if (aClass.isAnnotationPresent(Autowire.class)) {
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(HandleException.class)) {
                    try {
                        method.invoke(Context.MAP.get(aClass.getName()));
                    } catch (Exception e) {
                        HandleException annotation = method.getAnnotation(HandleException.class);
                        if (annotation.suppressException()) {
                            System.out.println("Alarm! Error!");
                        } else {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
