package product.org;

import jakarta.persistence.*;
import jakarta.persistence.criteria.*;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

public class productMain {
    private static Object li;

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

//        TypedQuery<Product> q = em.createQuery("from Product",Product.class);
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));


//        TypedQuery<Object[]> q = em.createQuery("select p.name,p.price,p.mfd from Product p",Object[].class);
//        List<Object[]> li = q.getResultList();
//        li.forEach(p-> System.out.println(p[0]+"-"+p[1]+"-"+p[2]));
//

//        TypedQuery<ProductDTO> q = em.createQuery("select new ProductDTO(p.name,p.price,p.mfd) from Product p",ProductDTO.class);
//        List<ProductDTO> li = q.getResultList();
//        for (ProductDTO productDTO : li) {
//            System.out.println(productDTO.getName()+" "+productDTO.getPrice()+" "+productDTO.getMfd());
//        }

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price < 70000",Product.class);
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));

//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.price <:target",Product.class);
//        q.setParameter("target",70000);
//
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));


//        TypedQuery<Product> q = em.createQuery("select p from Product p where p.name like:tar",Product.class);
//        q.setParameter("tar","I%");
//
//        List<Product> li = q.getResultList();
//        li.forEach(p-> System.out.println(p));



//        Query q = em.createQuery("update Product p set p.name=:name where p.name='IPhone'");
//        q.setParameter("name","IPhone 13");
//        int row = q.executeUpdate();
//        System.out.println("Updated rows : "+row);




//        Query q = em.createNativeQuery("update product_table p set p.price=55999 where p.p_id=103");
//        int row = q.executeUpdate();
//        System.out.println("Updated Successfully - "+row);
//
//        em.getTransaction().commit();


        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Product.class);

        Root<Product> r = cq.from(Product.class);

        Predicate condition1 = cb.lessThan(r.get("price"),60000);
//        cq.select(r).where(condition1);

//        Predicate condition2 = cb.like(r.get("name"),"I%");
//        cq.select(r).where(cb.or(condition2,condition1));

//        cq.orderBy(cb.asc(r.get("price")));


        cq.select(r).where(cb.between(r.get("price"),50000,100000)).orderBy(cb.asc(r.get("price")));
        List<Product> li = em.createQuery(cq).getResultList();

        li.forEach(p-> System.out.println(p.getPrice()));
    }
}

