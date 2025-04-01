package lesson_24_gof_patterns_01.livecoding_patterns.creational.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Cloneable {
    private String name;
    private String department;

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
