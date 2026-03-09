package Employee_Department;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee1 {
    @Id
    private int emp_id;
    private String name;
    private double salary;
    @ManyToOne
    @JoinColumn(name="Department_Name")
    private Department1 department;
}
