package lesson_07_Symbols_Strings.livecoding;

import java.util.StringJoiner;

public class MainString {
    public static void main(String[] args) {
    // compareStringsDeclaredThroughConstructorOrAssignmentOperator();

//       String str = new String("str");
//       String str1 = "str1";
//       String str2 = str + str1;
//       String intern = str.intern();
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
//
//        System.out.println(String.valueOf(1));
//        format("qwerty");
//        format("kghasjkfhk");
//
//        System.out.println(String.join(", ", "apple", "orange", "banana"));
//
//        StringJoiner sj = new StringJoiner(", ");
//        sj.add("apple");
//        sj.add("orange");
//        sj.add("banana");
//
//        System.out.println(sj);
//        System.out.println(sj.length());

        //System.out.println(str1.repeat(2));

        // Разные переменные ссылаются на разные обьекты в памяти
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // == сравнивает ссылки на место в памяти, будет false, места разные, т.к обьекты разные
        System.out.println(s1.equals(s2)); //Дефолтный иквалс сравнивает обьекты по содержанию. будет true, содержание идентично.

        //Здесь у нас две переменных ссылаются на один обьект в StringPool
        String str1 = "Top.java";
        String str2 = "Top.java";

        System.out.println(str1 == str2); //Результатом будет true, поскольку ссылки ведут к одной ячейке в памяти.

    }

    public static void format(String str) {
        System.out.println(String.format("bla bla bla %s", str));
    }

    public static void compareStringsDeclaredThroughConstructorOrAssignmentOperator() {
        String a = "Hello World"; // Literal, goes to StringPool
        String b = new String("Hello World"); // New object in Heap
        String c = "Hello World"; // Literal, the same object in Pool as a.

        // Comparing links (usning ==)

        System.out.println("a == b is: " + (a == b)); // false, as b is not from StringPool
        System.out.println("a == c is: " + (a == c)); // true, as both objects is from StringPool

        // Output of unique identifiers
        System.out.println("HashCode of a: " + System.identityHashCode(a)
                + " <- proves that a & c is same object, as they have identical hashCode");
        System.out.println("HashCode of b: " + System.identityHashCode(b)
                + " <- proves that b is different object, as it has different hashCode");
        System.out.println("HashCode of c: " + System.identityHashCode(c)
                + " <- proves that a & c is same object, as they have identical hashCode");

        //Checking values (using equals)
        System.out.println("a.equals(b): " + a.equals(b)); // true, as values is identical
        System.out.println("a.equals(c): " + a.equals(c)); // true, as values is identical
    }
}
