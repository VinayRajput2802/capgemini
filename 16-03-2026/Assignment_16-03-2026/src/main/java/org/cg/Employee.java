package org.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${empId}")
    private Integer empId;
    @Value("${empName}")
    private String empName;
    @Value("${salary}")
    private double salary;

    @Autowired
    private SBU bu;

    @Value("${age}")
    private Integer age;



    public Employee(){}

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public SBU getBu() {
        return bu;
    }

    public void setBu(SBU bu) {
        this.bu = bu;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
