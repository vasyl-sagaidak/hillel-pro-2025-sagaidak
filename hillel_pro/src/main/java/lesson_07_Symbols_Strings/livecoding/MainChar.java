package lesson_07_Symbols_Strings.livecoding;

import java.util.StringJoiner;

public class MainChar {
    public static void main(String[] args) {
        char a = 'a';
//        System.out.println(a);
//
//        int i = 211;
//        a = (char) i;
//        System.out.println(i);
//        System.out.println(a);

        for (int j = 0; j < 300; j++) {
            a = (char) j;
            System.out.println(j);
            System.out.println(a);
        }
    }
}
