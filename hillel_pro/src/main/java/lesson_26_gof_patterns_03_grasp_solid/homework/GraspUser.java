package lesson_26_gof_patterns_03_grasp_solid.homework;

public class GraspUser {
    private String name;
    private String surname;
    private int age;
    private GraspAddress homeAddress;

    public GraspUser(String name, String surname, int age, GraspAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.homeAddress = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAdress(String adress) {
        homeAddress.setHomeAddress(adress);
    }

    public String getAdress() {
        return homeAddress.getHomeAddress();
    }

    @Override
    public String toString() {
        return "Cын Вечности{" +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", возраст=" + age +
                " " + homeAddress.toString() +
                '}';
    }
}
