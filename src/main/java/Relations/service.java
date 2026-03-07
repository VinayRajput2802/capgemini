package Relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class service {
    Scanner sc = new Scanner(System.in);
    public void changeName(Person p){
        System.out.print("Enter Name: ");
        String new_name = sc.nextLine();
//        em.getTransaction().begin();
        p.setName(new_name);
//        em.getTransaction().commit();
    }

}
