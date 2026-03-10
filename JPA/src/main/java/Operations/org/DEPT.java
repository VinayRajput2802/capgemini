package Operations.org;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="dept")
public class DEPT {
    @Id
    private int emp_id;
    private String name;
    private double salary;
    private String dept_name;
}
