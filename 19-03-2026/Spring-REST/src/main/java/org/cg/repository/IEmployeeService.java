package org.cg.repository;

import org.cg.Entity.Employee;
import org.cg.dto.EmployeeDTO;
import org.hibernate.boot.jaxb.mapping.spi.JaxbPersistentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface IEmployeeService {
    public List<EmployeeDTO> getAllEmployee();
    public EmployeeDTO createEmployee(EmployeeDTO emp);
    public EmployeeDTO getEmployee(int empId);
    public String removeEmployee(int empId);
    public EmployeeDTO updateEmployee(Employee emp);
    public List<EmployeeDTO> getEmployeeByName(String name);
}
