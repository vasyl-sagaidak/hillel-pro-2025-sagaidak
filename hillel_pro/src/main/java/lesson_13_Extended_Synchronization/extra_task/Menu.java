package lesson_13_Extended_Synchronization.extra_task;

import java.security.SecureRandom;

public enum Menu {
    MONKEY_GLAND(10.90),
    BRAMBLE(11.30),
    BLOOD_AND_SAND(9.55),
    MARGARITA(12.80),
    MANHATTAN(14.25),
    ESPRESSO_MARTINI(11.0),
    WHISKEY_SOUR(10.5),
    MAI_TAI(10.45),
    PINA_COLADA(8.50),
    SAZERAC(9.55),
    MINT_JULEP(10.25),
    MARTINI(9.95),
    MOJITO(8.25),
    NEGRONI(9.10),
    GIMLET(11.50),
    MIMOSA(10.05),
    FRENCH_75(7.50),
    BELLINI(11.70),
    TOM_COLLINS(9.39),
    OLD_FASHIONED(9.99),
    DAIQUIRI(10.75),
    COSMOPOLITAN(14.20),
    MOSCOW_MULE(11.95),
    BLOODY_MARY(10.0),
    WHITE_RUSSIAN(10.0),
    LONG_ISLAND_ICE_TEA(18.0),
    APEROL_SPRITZ(15.0),
    APPLETINI(12.80),
    BOMBARDINO(13.20),
    MITCH_MARTINI(10.65),
    KALIMOTXO(11.25),
    WOO_WOO(9.95),
    RICKEY(9.60),
    EARTHQUAKE(9.99),
    JAPANESE_SLIPPER(11.30),
    SHANDY(9.0),
    BACARDI(9.0),
    VESPER(10.30),
    MICHELADA(11.35),
    B52(12.50),
    BOILERMAKER(11.75),
    BIJOU(13.0),
    ZOMBIE(11.0),
    CAIPIROSKA(10.75),
    BLACK_AND_TAN(9.95),
    SEX_ON_THE_BEACH(15.5),
    SCREWDRIVER(13.80),
    DEATH_IN_THE_AFTERNOON(14.20),
    CUBA_LIBRE(12.75),
    KAMIKAZE(13.15),
    PISCO_SOUR(10.45);

    private double drinkPrice;
    private static final SecureRandom random = new SecureRandom();

    Menu(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public static Menu getRandomDrink() {
        return values()[random.nextInt(values().length)];
    }
}
