package examples.generics.genericconstructor;

/*
Поскольку в GenCons() указан параметр обобщенного типа, который обязан быть подклассом Number, конструктор
GenCons() можно вызвать с любым числовым типом, включая Integer,Float и Double. Следовательно, хотя
GenCons - не является обобщенным классом, его конструктор является обобщенным.
 */

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showVal();
        test2.showVal();
    }
}
