package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private int empId;
    private String name;
    @Autowired
//    @Qualifier("address1")  // it is when both type ByType and ByName gives exceptioin then run
    private Address address;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printEmployeeDetails(){
        System.out.println("Employee id: "+this.empId);
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee city: "+this.address.getCity());
        System.out.println("Employee Country: "+this.address.getCountry());
        System.out.println("Employee zip: "+this.address.getZip());

    }
}
