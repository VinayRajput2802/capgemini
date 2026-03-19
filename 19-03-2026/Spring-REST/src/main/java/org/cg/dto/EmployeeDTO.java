package org.cg.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;


public class EmployeeDTO {
    private int id;
    private String name;
//    @JsonFormat(shape = )
    private LocalDate dob;
    private double salary;

    public EmployeeDTO(){
    }
    public EmployeeDTO(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public EmployeeDTO(int id, String name, LocalDate dob,double salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
