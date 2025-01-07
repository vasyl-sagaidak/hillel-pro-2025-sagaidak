package lesson_05.livecoding.blocks_init_order;

public class B extends A {

    {
        System.out.println("Нестатический 1 блок класса В");
    }

    public B() {
        System.out.println("Конструктор класса В");
    }

    static {
        System.out.println("Статический 1 блок класса В");
    }

    {
        System.out.println("Нестатический 2 блок класса В");
    }

    static {
        System.out.println("Статический 2 блок класса В");
    }

}
