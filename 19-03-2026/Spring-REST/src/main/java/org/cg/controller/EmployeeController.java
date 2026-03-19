package org.cg.controller;

import org.cg.Entity.Employee;
import org.cg.dto.EmployeeDTO;
import org.cg.dto.EntityMapper;
import org.cg.repository.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    @GetMapping(value = "emp")
    public List<EmployeeDTO> findAllEmp(){
        return service.getAllEmployee();
    }
    @GetMapping("find/{name}")
    public List<EmployeeDTO> findEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @GetMapping("findId/{id}")
    public ResponseEntity<EmployeeDTO> find(@PathVariable int id){

        EmployeeDTO e = service.getEmployee(id);
        if (e != null){
            return new ResponseEntity<EmployeeDTO>(e, HttpStatus.OK);
        }
        else return new ResponseEntity("Employee Not Found",HttpStatus.NOT_FOUND);
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id){
        return service.removeEmployee(id);
    }

    @PostMapping("create")
    public EmployeeDTO create(@RequestBody EmployeeDTO emp){
        return service.createEmployee(emp);

    }

}
