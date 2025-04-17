package lesson_29_JDBC.classwork.dto;

import lombok.AllArgsConstructor;

// DTO = Data Transfer Object
// Поля DTO являются колонками в базе данных
@AllArgsConstructor
public class Student {
private int id;
private String name;
private String phoneNumber;
private String description;
private int groupId;

    public Student(String name, String phoneNumber, String description, int groupId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.groupId = groupId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", description='" + description + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
