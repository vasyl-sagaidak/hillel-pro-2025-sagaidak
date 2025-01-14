package lesson_07.livecoding;

public class MainChar {
    public static void main(String[] args) {
        char a = 'a';
//        System.out.println(a);
//
//        String str = new String("str");
//        String str1 = "str1";
//        String str2 = str + str1;
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
//        format("qwerty");
//        format("ajdkgjfajdl");

        String s = "Foo";
        String s1 = new String("Foo");
        //String s2 = new String("Foo");

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        System.out.println(s.equals(s1));

        System.out.println(s);
        System.out.println(doIt(s));
        System.out.println(s);

    }

    public static void format(String str) {
        System.out.println(String.format("Bla bla bla bla %s", str));
    }

    public static String doIt(String s) {
        s = s.toLowerCase();
        return s;
    }
}
