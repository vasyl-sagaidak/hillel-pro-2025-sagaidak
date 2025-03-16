package lesson_21_Annotations_Reflection.homework;

public class HW21Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // Creating instance of the class
        ArrayUtils utils = new ArrayUtils();

        // Creating data to work with
        int[] arr = {9,6,3};
        int index = 1;

        // Test methods of the class
        utils.print(arr);
        int value = utils.getValue(arr, index);
        System.out.println("Value by index " + index + ": " + value);

        System.out.println(" ------- ");

        // Get instance of the class in one of three ways through the reflection API:
        //Class<? extends ArrayUtils> aClass = utils.getClass();
        //Class<?> aClass = Class.forName("lesson_21_Annotations_Reflection.homework.ArrayUtils");
        Class<?> aClass = ArrayUtils.class;

        // Get and output annotations for method print:
        Author author =
                aClass.getDeclaredMethod("print", int[].class).getAnnotation(Author.class);
        System.out.println(author.author());

        MethodInfo methodInfo =
                aClass.getDeclaredMethod("print", int[].class).getAnnotation(MethodInfo.class);
        System.out.println(methodInfo.methodName());
        System.out.println(methodInfo.description());
        System.out.println(methodInfo.returnType());

        System.out.println(" ------- ");

        // Get and output annotations for method getValue:
        Author getValue =
                aClass.getDeclaredMethod("getValue", int[].class, int.class).getAnnotation(Author.class);
        System.out.println(getValue.author());

        MethodInfo getValueInfo =
                aClass.getDeclaredMethod("getValue", int[].class, int.class).getAnnotation(MethodInfo.class);
        System.out.println(getValueInfo.methodName());
        System.out.println(getValueInfo.description());
        System.out.println(getValueInfo.returnType());
    }
}

/*
Console output:

[9, 6, 3]
Value by index 1: 6
 -------
author=Bob Dylan
methodName=print
description=String array representation
returnType=void
 -------
author=Johnny Cash
methodName=getValue
description=return value by index
returnType=int
 */