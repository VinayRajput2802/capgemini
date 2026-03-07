package package1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);
//        em.getTransaction().begin();
        while (true) {
            System.out.println("Add New DepartMent- - -  1");
            System.out.println("Add New Employee- - - -  2");
            System.out.println("Find Employee Department 3");
            System.out.println("Find All Employee by dep 4");
            System.out.println("Exit -  -  -  -  -  -  - 10");
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice==1) {
                System.out.print("Enter DepartMent Name: ");
                String d_name = sc.nextLine();
                em.getTransaction().begin();
                Department dept = new Department(d_name);
                em.persist(dept);
                em.getTransaction().commit();
            }
            else if(choice==2) {
                System.out.println("Enter Department Id: ");
                em.getTransaction().begin();
                int d_name2 = sc.nextInt();
                sc.nextLine();
                Department dept2 = em.find(Department.class, d_name2);
                if (dept2==null){
                    continue;
                }
                List<New_Employee> emps2 = new ArrayList<>();
                while (true) {
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    if (name == null || name.equals("exit")) {
                        break;
                    }
                    emps2.add(new New_Employee(name,dept2));

                }
                dept2.setEmps(emps2);
                em.getTransaction().commit();
            }

            else if(choice==4) {
                System.out.print("Enter Department Id: ");
                int d_name3 = sc.nextInt();
                sc.nextLine();
                Department dept3 = em.find(Department.class, d_name3);
                if (dept3==null){
                    System.out.println("No Department Fount");
                    continue;
                }
                List<New_Employee> emps3 = dept3.getEmployees();
                for (New_Employee emp : emps3) {
                    System.out.println(emp.getE_name());
                }
            }
            else if(choice==3) {
                System.out.print("Enter Employee Id: ");
                int emp_id3 = sc.nextInt();
                sc.nextLine();
                New_Employee emp3 = em.find(New_Employee.class, emp_id3);
                if (emp3 != null) {
                    System.out.println(emp3.getDepartment().getD_name());
                } else {
                    System.out.println("NO Employee Found");
                }
            }
            else if(choice==10){
                break;

                }

            }
//        em.getTransaction().commit();
    }
}
