package org.example;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

//        BOOK book = new BOOK(1,1000,"Maths");
//        BOOK book1 = new BOOK(2,1500,"Physics");
//
//        AUTHOR author = new AUTHOR(1,"RD","","Sharma","9876543210");
//        AUTHOR author1 = new AUTHOR(2,"HC","","VERMA","1234567890");
//
//        em.getTransaction().begin();
//        em.persist(book);
//        em.persist(book1);
//        em.persist(author1);
//        em.persist(author);
//        em.getTransaction().commit();
//
//        System.out.println("Details Enter Successfully");



        AUTHOR auth = em.find(AUTHOR.class,1);
        if (auth!=null){
            List<BOOK> li = em.createQuery("from BOOK where isbn = 1").getResultList();
            li.forEach(b-> System.out.println(b.toString()));
        }
    }
}