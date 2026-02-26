import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public double sumOfSalary() {
        double total_sal = EmployeeRepository.getEmployees().stream().mapToDouble(Employee::getSalary).sum();
        return total_sal;
    }
    public Map<String, Long> getEmployeeCountByDepartment() {
        Map<String, Long> employeeCount = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).map(e->e.getDepartment().getDepartmentName()).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        return employeeCount;
    }

    public String getOldestEmployee(){
        Employee oldestEmployee = EmployeeRepository.getEmployees().stream().min((e1,e2)->e1.getHireDate().compareTo(e2.getHireDate())).get();
        return oldestEmployee.getFirstName()+oldestEmployee.getLastName();
    }

    public List<String> calculate_days(){
//        LocalDate today = LocalDate.now();
//        Map<String,Long> differnceceDays = EmployeeRepository.getEmployees().stream().collect(Collectors.toMap(Employee::getFirstName,e-> ChronoUnit.DAYS.between(e.getHireDate(),today),(oldValue, newValue)->oldValue));
//        return differnceceDays;
        LocalDate today = LocalDate.now();
        List<String> period = EmployeeRepository.getEmployees().stream().map(
                e->{
                    int days = Period.between(e.getHireDate(),today).getDays();
                    int months = Period.between(e.getHireDate(),today).getMonths();
                    int years = Period.between(e.getHireDate(),today).getYears();
                    months =  months+(years*12);
                    String val = String.valueOf(months);
                    String val1 = String.valueOf(days);
                    return e.getFirstName()+" "+e.getLastName()+" -> "+val+" months "+val1+" days";
                }
        ).toList();
        return period;
    }
}
