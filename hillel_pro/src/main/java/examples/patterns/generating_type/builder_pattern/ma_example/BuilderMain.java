package examples.patterns.generating_type.builder_pattern.ma_example;

public class BuilderMain {
    public static void main(String[] args) {

        /*
        Builder, порождающий паттерн, позволяющий быстро создавать обьекты
        с произвольным количеством параметров, при использовании которого отпадает
        необходимость в перегрузке конструкторов.
         */

        Car toyotaCorolla = new Car.Builder() // вызов билдера обычным способом через ключевое слово new
                .withMake("Toyota")
                .withColor("White")
                .withModel("Corolla")
                .withYear(2018)
                .withEngine("1.8 liter")
                .withHorsePower(132)
                .build();

        Car subaruOutback = Car.builder() // вызов билдера через созданный нами статический метод builder()
                .withMake("Subaru")
                .withYear(2022)
                .withColor("Black")
                .withModel("Outback")
                .withEngine("2.4 liter, Turbocharged")
                .withHorsePower(260)
                .build();

        Car volkswagenPassat = Car.builder()
                .withMake("Volkswagen")
                .withModel("Passat B8")
                .withColor("Dark Grey")
                .withYear(2019)
                .withEngine("2.0 liter, TSI")
                .withHorsePower(206)
                .build();

        System.out.println(toyotaCorolla);
        System.out.println(subaruOutback);
        System.out.println(volkswagenPassat);
    }

}
