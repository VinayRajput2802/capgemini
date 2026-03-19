package org.cg.dto;

import org.cg.Entity.Employee;

import java.util.Optional;

public class EntityMapper {
    public static Employee convertObjectToEntity(EmployeeDTO edto){
        return new Employee(edto.getName(),edto.getDob(),edto.getSalary());
    }
    public static EmployeeDTO converObjectToDTO(Employee emp){
        return new EmployeeDTO(emp.getId(),emp.getName(),emp.getDob());
    }
}
