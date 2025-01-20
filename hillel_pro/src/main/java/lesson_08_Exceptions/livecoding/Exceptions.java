package lesson_08_Exceptions.livecoding;

public class Exceptions {

    static void checkedException(String message) throws Exception {
        throw new Exception("Exception" + message);
    }

    static void uncheckedException() {
        throw new RuntimeException("Runtime Exception");
    }

    public static void main(String[] args) throws Exception{
        try {
            checkedException("Hwafas");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("close resource block finally");
        }
    }
}
