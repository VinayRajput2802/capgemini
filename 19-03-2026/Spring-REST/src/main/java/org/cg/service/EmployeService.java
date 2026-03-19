package org.cg.service;

import org.cg.Entity.Employee;
import org.cg.dto.EmployeeDTO;
import org.cg.dto.EntityMapper;
import org.cg.repository.IEmployeeRepository;
import org.cg.repository.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class EmployeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository repo;


    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> li = repo.findAll();
        List<EmployeeDTO> liDto = new ArrayList<>();
        for (Employee i:li){
            liDto.add(EntityMapper.converObjectToDTO(i));
        }
        return liDto;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO emp) {

        Employee e = EntityMapper.convertObjectToEntity(emp);
        repo.saveAndFlush(e);
        return EntityMapper.converObjectToDTO(e);
    }

    @Override
    public EmployeeDTO getEmployee(int id) {
        Optional<Employee> op = repo.findById(id);
        if (op.isPresent()){
            return EntityMapper.converObjectToDTO(op.get());
        }
        else{
            return null;
        }
    }

    @Override
    public String removeEmployee(int id) {
        Optional<Employee> e = repo.findById(id);
        if (e.isPresent()){
            repo.deleteById(id);
            return "Remove Successfully";

        }
        return "No Data Found";

    }

    @Override
    public EmployeeDTO updateEmployee(Employee emp) {
        emp.setName("Rohit");
        repo.saveAndFlush(emp);
        return EntityMapper.converObjectToDTO(emp);
    }

    @Override
    public List<EmployeeDTO> getEmployeeByName(String name) {
        List<Employee> li = repo.findAllByName(name);
        List<EmployeeDTO> liDto = new ArrayList<>();
        for (Employee i:li){
            liDto.add(EntityMapper.converObjectToDTO(i));
        }
        return liDto;
    }


}
