import java.util.ArrayList;
import java.util.List;
public class filter {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<>();
        li.add(new Employee("Vinay",50000));
    }
}

class Employee {
    private String name;
    private int salary;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name,int salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}