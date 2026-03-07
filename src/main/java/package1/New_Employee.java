package package1;

import jakarta.persistence.*;

@Entity
public class New_Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int e_id;
    private String e_name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public New_Employee(){}
    public New_Employee(String e_name){
        this.e_name = e_name;
    }

    public New_Employee(String e_name, Department department) {
        this.e_name = e_name;
        this.department = department;
    }

    public int getE_id() {
        return e_id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
