package lesson_05.livecoding.constructors_initialisation_order;

public class InitializeMain {
    public static void main(String[] args) {
       // ParentClass pc = new ParentClass(); // Инициализируется конструктор Parent

       // ChildClass cc = new ChildClass(); // Инициализируется конструктор Parent, Инициализируется конструктор Child

        ParentClass pCh = new ChildClass(); // Инициализируется конструктор Parent, Инициализируется конструктор Child
    }
}

/*
Если мы создаем инстанс подкласса то он идет ко всем конструкторам уровнем выше, и по порядку их создает.
Если бы у нас ParentClass наследовал какой-то еще класс уровнем выше, например С, то у нас сначала бы создавался
конструктор этого класса С, потом ParentClass и только потом СhildClass.

Так же, независимо от записи:

ParentClass pc = new ChildClass();

ChildClass cc = new ChildClass();

вывод будет один и тот же, поскольку иерархия конструкторов та же самая.
 */
