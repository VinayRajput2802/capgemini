package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
    @Value("${name}")
    private String name;

    @Autowired
    private Address address;

    public Employee(){}

//    public Employee(Address address){    // This is the Constructor Injection remove all other Constructor
//        this.address = address;
//    }

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
}
