package new_package;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

//        Question q=new Question("What is Python","M");
//        List<Answer> li=new ArrayList<>();
//        li.add(new Answer("Python is oops",q));
//        li.add(new Answer("Python is Snake",q));
//        li.add(new Answer("Python is Easiest Language",q));
//        li.add(new Answer("Python have many libraries",q));
////        em.persist(li);
//        q.setAnswer(li);
//        em.persist(q);
        Question q = em.find(Question.class,1);
        if (q != null){
            System.out.println("Question - "+q.getQuestionName());
            System.out.println("----Answers---");
            for (Answer ans:q.getAnswer()){
                System.out.println(ans.getAnswer());
            }
        }


        em.getTransaction().commit();
        System.out.println("Table Have been created...");
    }
}
