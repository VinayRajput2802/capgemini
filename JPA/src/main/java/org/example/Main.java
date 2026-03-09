package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        PEmployee p_emp1 = new PEmployee();
//        p_emp1.setE_name("Saksham");
//        p_emp1.setDob(LocalDate.of(2003,10,12));
//        p_emp1.setSalary(56000);
//
//        em.persist(p_emp1);

//        CEmployee c_emp1 = new CEmployee();
//        c_emp1.setE_name("Abhigyan");
//        c_emp1.setDob(LocalDate.of(2012,10,12));
//        c_emp1.setPay_per_hour(1000);
//
//        em.persist(c_emp1);




        em.getTransaction().commit();

    }
}