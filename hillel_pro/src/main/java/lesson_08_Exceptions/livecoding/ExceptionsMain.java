package lesson_08_Exceptions.livecoding;

public class ExceptionsMain {
    public static void main(String[] args) {
        dividingOperation(4, 0);
    }

    static void dividingOperation(int i, int j) throws CustomHillelArithmeticException {
        if (j == 0) {
            throw new CustomHillelArithmeticException("j can't be null");
        }
        System.out.println(i / j);
    }
}
