package org.cg.service;

import org.cg.Entity.Employee;
import org.cg.repository.IEmployeeRepository;
import org.cg.repository.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Component
public class EmployeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository repo;


    @Override
    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    @Override
    public void createEmployee(Employee emp) {
        repo.save(emp);
    }

    @Override
    public Employee getEmployee(int id) {
        Optional e = repo.findById(id);
        if (e==null) {
            return null;
        }
        else {
            return (Employee) e.get();
        }
    }

    @Override
    public String removeEmployee(int id) {
        Optional e = repo.findById(id);
        if (e==null){
            return "No Data Found";
        }
        repo.deleteById(id);
        return "Remove Successfully";
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        emp.setName("Rohit");
        repo.saveAndFlush(emp);
        return emp;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return repo.findAllByName(name);
    }


}
