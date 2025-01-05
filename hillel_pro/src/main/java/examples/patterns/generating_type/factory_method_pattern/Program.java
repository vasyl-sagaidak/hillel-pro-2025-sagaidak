package examples.patterns.generating_type.factory_method_pattern;

public class Program {
    public static void main(String[] args) {
        /*
        Фабричный метод - порождающий паттерн, определяющий общий интерфейс
        для создания обьектов в суперклассе, позволяя подклассам изменять тип создаваемых обьектов.

        Целью данного шаблона является создание интерфейса, который пораждает обьекты. При этом, выбор того экземпляра,
        какого именно класса будет создан обьект, остается за классами которые реализуют данный интерфейс.

        Шаблон используется для делигирования полномочий создания обьектов другому классу. Например,
        когда нам заранее неизвестно экземпляры какого класса нам нужно будет создать,
        либо если класс спроектирован так, что создаваемые им обьекты имеют свойства какого-то конкретного класса.

        Паттерн Фабричный метод предлагает создавать обьекты не напрямую, используя оператор new,
        а через вызов особого фабричного метода. Обьекты все равно будут создаваться при помощи new,
        но делать это будет фабричный метод.

        На первый взгляд, это может показаться бессмысленным: мы просто переместили вызов конструктора
        из одного конца программы в другой. Но теперь вы сможете переопределить фабричный метод в подклассе,
        чтобы изменить тип создаваемого продукта.

        Чтобы эта система заработала, все возвращаемые объекты должны иметь общий интерфейс.
        Подклассы смогут производить объекты различных классов, следующих одному и тому же интерфейсу.
         */
        DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
