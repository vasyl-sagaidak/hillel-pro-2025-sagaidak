package lesson_13_Extended_Synchronization.extra_task;

public enum Drinks {
    LONG_ISLAND_ICE_TEA(12.0),
    MOJITO(9.25),
    MARGARITA(9.25),
    COSMOPOLITAN(10.0),
    MANHATTAN(12.0),
    MARTINI(8.75),
    CUBA_LIBRE(9.50),
    WHITE_RUSSIAN(7.90),
    TEQUILA_BOOM(9.0),
    WHISKEY_SOUR(10.0),
    GIMLET(8.30),
    PINA_COLADA(7.15),
    PALOMA(8.0),
    SAZERAC(8.0),
    NEGRONI(9.25),
    MAI_TAI(9.50),
    MOSCOW_MULE(8.75),
    CAIPIRINHA(8.20),
    BLOODY_MARY(7.50),
    MIMOSA(9.50),
    MINT_JULEP(7.80),
    OLD_FASHIONED(8.25),
    DARK_N_STORMY(9.00),
    STRAWBERRY_DAIQUIRI(9.50);

    private double price;

    Drinks(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
