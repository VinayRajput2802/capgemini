package org.cg.repository;

import org.cg.Entity.Employee;
import org.hibernate.boot.jaxb.mapping.spi.JaxbPersistentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface IEmployeeService {
    public List<Employee> getAllEmployee();
    public void createEmployee(Employee emp);
    public Employee getEmployee(int empId);
    public String removeEmployee(int empId);
    public Employee updateEmployee(Employee emp);
    public List<Employee> getEmployeeByName(String name);
}
