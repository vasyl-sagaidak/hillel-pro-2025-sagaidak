package lesson_25_gof_patterns_02.livecoding_patterns.behavioral.command;

/*
Command - паттерн, превращающий запросы в обьекты, позволяя передавать их как аргументы
во время вызова методов. Ставить запросы в очередь, логировать их, а так-же поддерживать
отмену операций.
 */

public class Command_Pattern_Main {
    public static void main(String[] args) {
        Electricity light = new Electricity();

        Command swichOn = new FlipUpCommand(light);
        Command swichOff = new FlipDownCommand(light);

        Switch swicher = new Switch();
        swicher.executeAndStore("ON", swichOn);
        swicher.executeAndStore("OFF", swichOff);

        swicher.getHistory().get("ON").execute();
    }
}
