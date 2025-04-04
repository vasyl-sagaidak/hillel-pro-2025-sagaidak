package lesson_26_gof_patterns_03_grasp_solid.livecoding_patterns.behavioral.mediator;

/*
Mediator - паттерн, позволяющий уменьшить(ослабить) связанность множества классов между
собой благодаря перемещению этих связей в один класс-посредник.

В данном случае у нас пример чата пользователей.
 */

public class Mediator_Pattern_Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorService();

        User alice = new ChatUserService(chatMediator, "Alice");
        User bob = new ChatUserService(chatMediator, "Bob");
        User john = new ChatUserService(chatMediator, "John");
        User charlie = new ChatUserService(chatMediator, "Charlie");

        chatMediator.addUser(alice);
        chatMediator.addUser(bob);
        chatMediator.addUser(john);
        chatMediator.addUser(charlie);

        alice.send("Hello guys!");
        bob.send("Hey everyone! Nice to read you Alice, how are you?");
        john.send("Hej dear colleagues!");
        charlie.send("New week == New challenges ;)");
    }
}
