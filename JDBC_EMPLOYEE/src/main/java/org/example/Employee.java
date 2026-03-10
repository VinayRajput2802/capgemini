package org.example;

public class Employee {

    private String id;
    private String name;
    private int salary;
    private String dob;



    public Employee() {}

    public Employee(String name, int salary,String dob,String id) {
        setSalary(salary);
        setId(id);
        setDob(dob);
        setName(name);
    }

    // Getter
    public String getId() { return id; }
    public String getName() { return name; }
    public int getSalary() { return salary; }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    // Setter
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(int salary) { this.salary = salary; }
}
