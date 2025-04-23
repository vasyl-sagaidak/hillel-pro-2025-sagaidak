package lesson_30_JPA_and_Hibernate.classwork.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="pk_students_id")
    private int id;
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String description;
    @ManyToOne
    @JoinColumn(name = "fk_hillel_group_id")
    private Group group;

    public Student() {

    }

    public Student(String name, String phoneNumber, String description, Group groupId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.group = groupId;
    }
}
