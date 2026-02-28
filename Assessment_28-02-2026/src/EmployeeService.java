import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Collections.max;

public class EmployeeService {
    public double averageSalary() {
        double avg_salary = EmployeeRepository.getEmployees().stream().collect(Collectors.averagingDouble(Employee::getSalary));
        return avg_salary;
    }


    public Map<String, Optional<Employee>> EachDepartmentMaximumSalaryEmployee() {
        return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null).collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(),
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
        ));
    }

    public Map<Department, Double> EachDepartmentTotalSalary() {
        return EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
    }

    public void DisplayEmployeeWithSalary() {
        EmployeeRepository.getEmployees().stream().forEach(e -> {
            System.out.println(e.getFirstName()+" "+e.getLastName() + " -> " + e.getSalary());
        });
    }

    public void SortedSalary(){
        EmployeeRepository.getEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(
                e->{
                    System.out.println(e.getFirstName()+" "+e.getLastName() + " -> " + e.getSalary());
                }
        );
    }
}


