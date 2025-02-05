package lesson_12_Multithreading.theory.multithreading_problems;

// Состояние гонки обработано.
// В критической секции увеличивается общая целочисленная переменная
// и отображается ее значение.
// Создается 6 потоков, и каждый поток увеличивает,
// и потом отображает значение переменной.
// Ожидаемое поведение состоит в том, что каждый поток должен получить
// уникальное значение от 1 до 6.
// Синхронизация вызова метода должна избежать состояния гонки.
// Использование синхронизации гарантирует что модификация переменной
// в одном потоке выполняется без вмешательства других потоков.
// При нескольких запусках программы потоки получают УНИКАЛЬНОЕ значение.
public class RaceConditionMain02 {

    int count;

    public static void main(String[] args) {
        RaceConditionMain02 main02 = new RaceConditionMain02();
        for (int i = 0; i <= 6; i++) {
            new Thread(() -> {
                synchronized (main02) {
                    main02.incrementCounter();
                    System.out.println(Thread.currentThread().getName()
                    + " get value " + main02.getCounter());
                }
            }).start();
        }
    }

    public void incrementCounter() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
        }
        count++;
    }

    public int getCounter() {
        return count;
    }

    /*
        Результат выполнения кода всегда будет одинаковым и ожидаемым:

        Thread-0 get value 1
        Thread-5 get value 2
        Thread-4 get value 3
        Thread-3 get value 4
        Thread-2 get value 5
        Thread-1 get value 6
     */
}
