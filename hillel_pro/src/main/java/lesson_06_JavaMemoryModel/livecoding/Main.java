package lesson_06_JavaMemoryModel.livecoding;

import examples.enums.Temperatures;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {

    public static final int MAX_LIMIT = 1000;
    public static void main(String[] args) throws InterruptedException {
//        char a = 'a';
//        int num = a;
//        System.out.println(num);
//        System.out.println(a);

        /*
        написать код, который выводит числа от 0 до 1000, которые делятся на 3, но не делятся на 5,
        и сумма цифр в которых меньше десяти.
         */

        //taskInv();


        String abc = "Hello World";
        WeakReference<String> ref = new WeakReference<String>(abc);
        SoftReference<String> ref2 = new SoftReference<String>(abc);
        WeakReference<Object> wr = new WeakReference<>(new Object());

        for (Temperatures value : Temperatures.values()) {
            System.out.println("The weather is " + value + ", temperature is " + value.getTemperature() + "'C");

        }
    }

    public int calculate(int number) {
        return number + calculate(number - 1);
    }

    public static void taskInv() {

        for (int i = 0; i <= MAX_LIMIT; i++) {

            if (i % 3 == 0 && i % 5 != 0) {

                int temp = i;
                int sum = 0;

                while (temp > 0) {
                    sum += temp % 10;
                    temp = temp / 10;
                }

                if (sum < 10) {
                    System.out.println(i);
                }
            }
        }
    }
}

class Gen<T extends Super> {
    T value;

    Gen(T value) {
        this.value = value;
    }

    public T getValue() {

        return value;
    }
}

abstract class Super {
    abstract void method();
}
