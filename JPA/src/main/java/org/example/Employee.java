package org.example;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDate;

@Entity
//1. Single Table (use only one table for all inheritences)
//2. Table Per Class(this use mulitple table for all child class)
//3.
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="EmployeeType")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int e_id;
    private LocalDate dob;
    private String e_name;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }
}
