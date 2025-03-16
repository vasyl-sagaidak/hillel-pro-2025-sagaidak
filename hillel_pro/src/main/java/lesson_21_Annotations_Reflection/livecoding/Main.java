package lesson_21_Annotations_Reflection.livecoding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Service service = new Service();

        Class<? extends Service> aClass = service.getClass();
        Class class1 = (Class) Class.forName("lesson_21_Annotations_Reflection.livecoding.Service");

        inspectClass(aClass);
        inspectClass(class1);
        inspectClass(String.class);

        inspectMethods(aClass);


        Context context = new Context();
        Service bean = (Service) context.getBean("lesson_21_Annotations_Reflection.livecoding.Service");
        bean.method();

    }

    static void inspectClass(Class<?> aClass) {
        System.out.println(aClass.getName());
        if (aClass.isAnnotationPresent(Autowire.class)) {
            System.out.println("Annotated");
        }
    }

    static void inspectMethods(Class<?> className) {
        Method[] methods = className.getMethods();
        Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));
    }
}
