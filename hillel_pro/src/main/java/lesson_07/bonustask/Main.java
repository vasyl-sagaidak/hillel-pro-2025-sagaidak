package lesson_07.bonustask;

/*
Опис задачі: В проекті, який складається з декількох класів, має бути реалізовано функціонал
видалення відповідного слова з набору слів. Виведення має бути таким:

(1)orange (2)plum (3)tomato (4)grape
 */

public class Main {
    public static void main(String[] args) {
        getOutput(new Remover().handleData(new DataProvider().getData()));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
