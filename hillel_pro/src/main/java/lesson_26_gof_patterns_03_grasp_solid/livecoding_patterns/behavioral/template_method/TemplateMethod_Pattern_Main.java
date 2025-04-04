package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.template_method;

/*
Template Method - паттерн, который определяет шаблон поведения (скелет) алгоритма,
перекладывая ответственность за некоторые из шагов в ходе его выполнения на подклассы.
Данный паттерн позволяет подклассам переопределять шаги (ход) алгоритма,
не изменяя его общей структуры.
 */

// В данном случае у нас реализация на примере Data Exporter'a (открываем файл,
// что-то туда записываем, закрываем файл.

public class TemplateMethod_Pattern_Main {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter json = new JSONExporter();

        csv.export();
        json.export();

    }
}
