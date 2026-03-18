package org.cg.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Value("${name}")
    private String name;
    @Value("${dob}")
    private LocalDate dob;
    @Value("${salary}")
    private double salary;
    @Autowired
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="deptId")
//    private Department department;

    public Employee(){}

    public Employee(String name, LocalDate dob, double salary) {
        super();
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public int id() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
