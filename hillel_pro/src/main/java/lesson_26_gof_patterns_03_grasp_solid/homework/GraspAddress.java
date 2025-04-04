package lesson_26_gof_patterns_03_grasp_solid.homework;

public class GraspAddress {
    private String homeAddress;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Домашний адрес={" + "\'"
                + homeAddress + "\'"
                +'}';
    }
}
