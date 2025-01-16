package lesson_05_Inheritance_Polymorphism.livecoding.blocks_init_order;
/*
ПОРЯДОК ИНИЦИАЛИЗАЦИИ:

1) Статические блоки инициализации <Родителя>
2) Статические блоки инициализации <Наследника>
3) Нестатические блоки инициализации <Родителя>
4) Конструктор <Родителя>
5) Нестатические блоки инициализации <Наследника>
6) Конструктор <Наследника>

 */
public class BlocksMain {
    public static void main(String[] args) {
        A a = new B();
    }
}
