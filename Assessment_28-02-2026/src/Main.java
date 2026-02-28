public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        System.out.println(service.averageSalary());

        System.out.println(service.EachDepartmentMaximumSalaryEmployee());

        System.out.println(service.EachDepartmentTotalSalary());

        service.DisplayEmployeeWithSalary();

        service.SortedSalary();
    }
}


