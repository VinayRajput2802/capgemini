public class SingleTon {
    public static void main(String[] args) {
        Employee obj = Employee.getEmployee();
        Employee obj1 = Employee.getEmployee();
        System.out.println(obj1);
        System.out.println(obj);
    }
}

class Employee{
    private static Employee emp;
    public static Employee getEmployee(){
        if (emp == null) {
            emp = new Employee();
        }
        return emp;
    }
}
