package lesson_21_Annotations_Reflection.livecoding;

@Autowire
public class Service {

    @HandleException(suppressException = true)
    public void method() {
        System.out.println("I'm bean Service!!!");
        throw new RuntimeException("Unable to call method");
    }
}
