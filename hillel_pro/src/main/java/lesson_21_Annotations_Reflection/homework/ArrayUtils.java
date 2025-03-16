package lesson_21_Annotations_Reflection.homework;

import java.util.Arrays;

public class ArrayUtils {

    @Author(author = "author=Bob Dylan")
    @MethodInfo(
            methodName = "methodName=print",
            returnType = "returnType=void",
            description = "description=String array representation"
    )
    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Author(author = "author=Johnny Cash")
    @MethodInfo(
            methodName = "methodName=getValue",
            returnType = "returnType=int",
            description = "description=return value by index")
    public int getValue(int[] array, int index) {
        if (index < array.length) {
            return array[index];
        }
        return -1;
    }

}
