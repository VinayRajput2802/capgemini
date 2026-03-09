package Employee_Department;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Employee;

public class Employee_main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Employee1 emp = new Employee1();
        emp.setName("Vinay Kumar");
        emp.setEmp_id(1);
        Department1 dept = new Department1();
        dept.setDept_name("HR");
        emp.setDepartment(dept);

        em.persist(emp);

        em.getTransaction().commit();
    }
}
