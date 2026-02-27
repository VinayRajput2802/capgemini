import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();


        System.out.println("Total Salary -> " + service.sumOfSalary());

        System.out.println("Total Salary By Dept -> " + service.getEmployeeCountByDepartment());

        System.out.println("Oldest Employee -> " + service.getOldestEmployee());

        List<String> period = service.calculate_days();

        for (String period1 : period) {
            System.out.println(period1);
        }

        List<Employee> get_Employee_without_dept = service.getEmployeeWithNoDept();
        System.out.println("Employee without dept -> " + get_Employee_without_dept);

        List<Department> get_department_without_employee = service.getDeptWithNoEmployee();
        System.out.println("Department without employee -> " + get_department_without_employee);

        String department_with_most_emp = service.getDeptWithMostEmployee();
        System.out.println(department_with_most_emp);

    }
}