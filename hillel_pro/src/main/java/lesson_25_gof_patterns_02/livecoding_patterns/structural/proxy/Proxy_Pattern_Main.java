package lesson_25_gof_patterns_02.livecoding_patterns.structural.proxy;

/*
PROXY (ПРОКСИ):
           -> Предоставляет замену другого обьекта для контроля доступа к нему.
 */

public class Proxy_Pattern_Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("128.0.0.123://home/photos/1.jpeg");

        // Запрос состоится только по вызову метода display().
        image.display();
    }
}
