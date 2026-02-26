import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();


        System.out.println("Total Salary -> "+service.sumOfSalary());

        System.out.println("Total Salary By Dept -> "+service.getEmployeeCountByDepartment());

        System.out.println("Oldest Employee -> "+service.getOldestEmployee());

        List<String> period = service.calculate_days();

        for (String period1 : period) {
            System.out.println(period1);
        }
    }
}