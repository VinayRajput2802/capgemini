package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class Employee_Service {
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
    EntityManager em = emf.createEntityManager();

    public Employee find_employee(int id){
        return em.find(Employee.class,id);
    }

    public void UpdateName(Employee emp){
        System.out.println("Enter new Name");
        String name = sc.nextLine();

        em.getTransaction().begin();
        emp.setName(name);
        em.getTransaction().commit();
    }

    public void UpdateSalary(Employee emp){
        System.out.print("Enter new Salary- ");
        int sal = sc.nextInt();

        em.getTransaction().begin();
        emp.setSalary(sal);
        em.getTransaction().commit();
    }

    public void AddEmployee(Employee emp){
        boolean check = em.contains(emp);
        if (check){
            System.out.println("Already Exist");
        }
        else {
            em.getTransaction().begin();
            em.persist(emp);
            em.getTransaction().commit();
        }
    }
}
