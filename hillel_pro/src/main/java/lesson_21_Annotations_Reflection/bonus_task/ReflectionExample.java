package lesson_21_Annotations_Reflection.bonus_task;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionExample {

    // Метод для аналізу класу та виведення інформації про нього
    public void analyzeClass(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);

        // Виведення інформації про клас
        System.out.println("Інформація про клас: " + clazz.getSimpleName());

        // Виведення інформації про поля класу
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Поля класу:");
            for (Field field : fields) {
                System.out.println("\t" + field.getName());
            }
        } else {
            System.out.println("Клас не має полів.");
        }

        // Виведення інформації про методи класу
        Method[] methods = clazz.getDeclaredMethods();
        if (methods.length > 0) {
            System.out.println("Методи класу:");
            for (Method method : methods) {
                System.out.println("\t" + method.getName());
            }
        } else {
            System.out.println("Клас не має методів.");
        }

        // Виведення інформації про анотації класу
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations.length > 0) {
            System.out.println("Анотації класу:");
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation.annotationType().getSimpleName());
            }
        } else {
            System.out.println("Клас не має анотацій.");
        }
    }

    // Метод для виклику методу класу з вказаними аргументами
    public Object callMethod(String className, String methodName, Object... args)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(className);
        Method method = clazz.getDeclaredMethod(methodName,
                Arrays.stream(args).map(Object::getClass).toArray(Class<?>[]::new));

        // Ініціалізуємо екземпляр класу (потрібен для виклику методу)
        Object instance = clazz.getDeclaredConstructor(clazz).newInstance("");

        // Виклик методу з вказаними аргументами на екземплярі класу
        return method.invoke(instance, args);
    }

    public static void main(String[] args) {
        ReflectionExample reflectionExample = new ReflectionExample();

        try {
            // Виведення інформації про клас java.lang.String
            reflectionExample.analyzeClass("java.lang.String");

            // Виклик методу length() класу java.lang.String
            System.out.println("Результат виклику методу length() класу java.lang.String: " +
                    reflectionExample.callMethod("java.lang.String", "length"));

        } catch (ClassNotFoundException
                 | NoSuchMethodException
                 | IllegalAccessException
                 | InvocationTargetException
                 | InstantiationException e) {
            System.out.println("Помилка.");
        }
    }
}
