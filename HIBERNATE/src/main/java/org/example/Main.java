package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        // -- for adding data into database --
//        Product p1 = new Product(102,"BMW M1",800000000,2);
//        Product p2 = new Product(103,"ROG",70000,5);
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        em.persist(p1);
//        em.persist(p2);
//        tx.commit();


        // -- how to find data --
//        Product p = em.find(Product.class,101);
//        System.out.println(p.getPid()+" "+p.getP_name());
//
//        System.out.println("-----------PRODUCTS ADDED SUCCESSFULLY----------");


        // -- how to remove data --
//
//        em.getTransaction().begin();
//        Product p = em.find(Product.class,101);
//        if (p!=null){
//            em.remove(p);
//            System.out.println("Prduct Remove Successfully");
//        }
//        else{
//            System.out.println("Product Not Found");
//        }
//        em.getTransaction().commit();


      List<Product> li = em.createQuery("from Product").getResultList();
      li.forEach(p->System.out.println(p.getP_name()));
    }
}