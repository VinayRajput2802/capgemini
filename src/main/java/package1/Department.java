package package1;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int d_id;
    @Column(unique = true)
    private String d_name;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<New_Employee> emps = new ArrayList<>();

    public Department() {}

    public Department(String d_name) {
        this.d_name = d_name;
    }

    public List<New_Employee> getEmployees() {
        return emps;
    }

    public void setEmps(List<New_Employee> emps) {
        this.emps.addAll(emps);
    }

    public int getD_id() {
        return d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }
}
