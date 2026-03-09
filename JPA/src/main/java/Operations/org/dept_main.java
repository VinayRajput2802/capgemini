package Operations.org;

import Employee_Department.Department1;
import Employee_Department.Employee1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import product.org.Product;

import java.util.List;
import java.util.Queue;

public class dept_main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);

        Root<DEPT> r = cq.from(DEPT.class);

        em.getTransaction().begin();
//        CriteriaQuery<DEPT> cq = cb.createQuery(DEPT.class);
//        cq.multiselect(r.get("dept_name"),cb.count(r));
//        cq.groupBy(r.get("dept_name"));

//        cq.select(r).where(cb.equal(r.get("dept_name"),"HR"));


        cq.multiselect(r.get("dept_name"),cb.count(r));
        cq.groupBy(r.get("dept_name"));

        List<Object[]> li = em.createQuery(cq).getResultList();

        li.forEach(p-> System.out.println(p[0]+"-"+p[1]));


        em.getTransaction().commit();
    }
}
