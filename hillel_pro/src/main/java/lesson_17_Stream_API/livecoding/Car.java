package lesson_17_Stream_API.livecoding;

import java.util.List;

public class Car {
    private int id;
    private List<Passenger> passengerList;

    public Car(int id, List<Passenger> passengerList) {
        this.id = id;
        this.passengerList = passengerList;
    }

    public int getId() {
        return id;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", passengerList=" + passengerList +
                '}';
    }
}
