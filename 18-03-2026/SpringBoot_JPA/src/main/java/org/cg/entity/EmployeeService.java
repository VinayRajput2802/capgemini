package org.cg.entity;

import org.cg.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo erepo;
    public String createEmployee(Employee emp){
        erepo.saveAndFlush(emp);
        return "Data Saved";
    }
    public List<Employee> getAll(){
        return erepo.findAll();
    }
    public String findEmployee(int id){
        Optional<Employee> emp =  erepo.findById(id);
        if (emp != null){
            return emp.get().getName();
        }
        else{
            return "No Data Found";
        }
    }
    public String removeEmployee(int id){
        erepo.deleteById(id);
        return "deleted Successfulll";

    }

    public String updateEmployee(int id){
        Optional<Employee> e = erepo.findById(id);
        if (e==null){
            return "no found";
        }
        Employee emp = e.get();
        emp.setName("Luvv");
        erepo.saveAndFlush(emp);
//        erepo.save(e);
        return "Update Successfull";
    }

    public List<Employee> getEmployeeByName(String name){

        return erepo.findByName(name);
    }
    public List<Employee> getEmployeeBornInParticularMonth(int month) {
        return erepo.findByDobBetween(LocalDate.of(2004, month, 01), LocalDate.of(2004, month, 29));
    }
}
