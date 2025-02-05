package lesson_12_Multithreading.theory.multithreading_problems;

// Состояние гонки.
// В критической секции увеличивается общая целочисленная переменная
// и отображается ее значение.
// Создается 6 потоков, и каждый поток увеличивает,
// а потом отображает значение переменной.
// Ожидаемое поведение состоит в том, что каждый поток должен получить
// уникальное значение от 1 до 6, НО так не происходит.
// При нескольких запусках программы, результат может быть разным,
// но потоки не получают уникального значения.
public class RaceConditionMain01 {
    int counter;

    public static void main(String[] args) {
        RaceConditionMain01 main01 = new RaceConditionMain01();

        for (int i = 0; i <= 6; i++) {
            new Thread(() -> {
                main01.incrementCounter();
                // Переменная и вывод переменной
                System.out.println(Thread.currentThread().getName()
                + " get value " + main01.getCounter());
            }).start();
        }
    }

    public void incrementCounter() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
        }
        counter++;
    }

    public int getCounter() {
        return counter;
    }
    /*
    Результат работы программы:

    Thread-3 get value 2
    Thread-5 get value 2
    Thread-2 get value 3
    Thread-0 get value 4
    Thread-1 get value 5
    Thread-4 get value 2

     */
}
