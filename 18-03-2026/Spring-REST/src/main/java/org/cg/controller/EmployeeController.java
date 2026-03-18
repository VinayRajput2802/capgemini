package org.cg.controller;

import org.cg.Entity.Employee;
import org.cg.repository.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    @GetMapping("emp")
    public List<Employee> findAllEmp(){
        return service.getAllEmployee();
    }
    @GetMapping("find/{name}")
    public List<Employee> findEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @GetMapping("findId/{id}")
    public Employee find(@PathVariable int id){
        return service.getEmployee(id);
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id){
        return service.removeEmployee(id);
    }

}
