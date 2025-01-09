package examples.generics.wildcard;

public class BoundedWildcard {
    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-23)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("Содержимое tdlocs.");
        Coords.showXY(tdlocs);
        // Coords.showXYZ(tdlocs); //Ошибка, не обьект ThreeD
        // Coords.showAll(tdlocs); //Ошибка, не обьект FourD

        FourD[] fourd = {
                new FourD(1,2,3,4),
                new FourD(6,8,14,8),
                new FourD(22,9,4,9),
                new FourD(3,-2,-23,17)
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fourd);

        System.out.println("Содержимое fdlocs");
        Coords.showXY(fdlocs);
        Coords.showXYZ(fdlocs);
        Coords.showAll(fdlocs);
    }
}
