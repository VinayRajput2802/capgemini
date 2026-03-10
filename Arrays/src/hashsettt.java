import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class hashsettt {
    public static void main(String[] args) {
        Set hs = new HashSet<>();
        hs.add(new Employee("Vinay"));
        hs.add(new Employee("Vinay"));
        hs.add(new String("Vinay"));
        hs.add(new String("Vinay"));
        System.out.println(hs);
        System.out.println(hs.size());
        Employee e = new Employee("Vinay");
        Employee e1 = new Employee("Vinay");
        Employee e2 = new Employee("Vinay Kumar");
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e.equals(e1));
        System.out.println(e.equals(e2));
    }
}
class Employee{
    @Override
    public int hashCode() {
        System.out.println("############");
        return name.length();
    }

    private String name;
    public Employee(String name){
        this.name = name;
    }

    public boolean equals(Object o){
        System.out.println("=========");
        if(o instanceof Employee && this.name.equals(((Employee)o).name)){
            return true;
        }
        return false;
    }
    public String toString(){
        return this.name;
    }

}
@FunctionalInterface
interface comparable{
//    public int compare(Employee e1, Employee e2);
    public int add(int a, int b);
}
