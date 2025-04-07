package lesson_26_gof_patterns_03_grasp_solid.homework;

public class Grasp_Homework_Main {
    public static void main(String[] args) {
        GraspAddress address = new GraspAddress();
        GraspUser user = new GraspUser("Юрий", "Гарарин", 27, address);
        user.setAdress("Земная орбита, 12 апреля 1961 года");
        System.out.println(user);
        System.out.println("Separate address output: " + user.getAdress());
    }
}

/*
Cын Вечности{имя='Юрий', фамилия='Гарарин', возраст=27 Домашний адрес={'Земная орбита, 12 апреля 1961 года'}}
Separate address output: Земная орбита, 12 апреля 1961 года

Process finished with exit code 0
 */
