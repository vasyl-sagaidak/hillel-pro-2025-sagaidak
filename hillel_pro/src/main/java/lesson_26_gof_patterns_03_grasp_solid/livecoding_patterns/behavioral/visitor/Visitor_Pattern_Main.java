package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.visitor;

/*
Visitor - паттерн, позволяющий создавать новые операции, не изменяя текущие
методы классов обьектов, над которыми могут выполняться операции.
 */

// Реализация на примере составного html документа из параграфа, изображения итп.

import java.util.Arrays;
import java.util.List;

public class Visitor_Pattern_Main {
    public static void main(String[] args) {
        List<DocumentElement> document =
                Arrays.asList(
                        new Paragraph("Hello, Java"),
                        new Image("/home/images/image.jpeg"),
                        new Paragraph("The End.")
                );

        HTMLExporterService htmlExporterService = new HTMLExporterService();
        for (DocumentElement elements : document) {
            elements.accept(htmlExporterService);
        }

        PlainTextExporterService plainTextExporterService = new PlainTextExporterService();
        for (DocumentElement elements : document) {
            elements.accept(plainTextExporterService);
        }
    }
}
