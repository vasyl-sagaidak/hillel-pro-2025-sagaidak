package lesson_17_Stream_API.livecoding;

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}
