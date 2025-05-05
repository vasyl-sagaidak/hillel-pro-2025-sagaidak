package lesson_30_JPA_and_Hibernate.homework.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@Table(name = "homework")
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_homework_id")
    private Long id;
    private String description;
    @Column(name = "dead_line")
    private LocalDate deadLine;
    private int mark;
    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;

    public Homework() {

    }

    public Homework(String description, LocalDate deadLine, int mark, Student student) {
        this.description = description;
        this.deadLine = deadLine;
        this.mark = mark;
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return Objects.equals(id, homework.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
