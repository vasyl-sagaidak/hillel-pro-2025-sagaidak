package lesson_05_Inheritance_Polymorphism.livecoding.blocks_init_order;

public class A {

    static {
        System.out.println("Статический 1 блок класса A");
    }

    {
        System.out.println("Нестатический 1 блок класса A");
    }

    public A() {
        System.out.println("Конструктор класса А");
    }

    static {
        System.out.println("Статический 2 блок класса A");
    }

    {
        System.out.println("Нестатический 2 блок класса A");
    }
}
