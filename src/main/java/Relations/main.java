package Relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        service ser = new service();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        Person p1 = new Person("Ankit", LocalDate.of(2001,10,12));

        em.getTransaction().begin();
//        DL dl1 = new DL();
        DL dl1 = new DL(LocalDate.of(2032,10,12),LocalDate.of(2012,10,12),"LMV,HMV");
//        em.persist(dl1);
        p1.setDl(dl1);
        em.persist(p1);
        em.getTransaction().commit();
        em.getTransaction().begin();
        while (true) {
            System.out.println("Change Name - - 1");
            System.out.println("Find DL - - - - 2");
            System.out.println("Delete Data - - 3");
            System.out.println("Change Expiry - 4");

            System.out.println("Exit  - - - - - 10");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice==1){
                System.out.print("Enter Person Id- ");
                int pid = sc.nextInt();
                sc.nextLine();
                Person p = em.find(Person.class,pid);
                if (p!=null){
                    ser.changeName(p);
                }
                else{
                    System.out.println("No person found");
                }
            }
            else if(choice==2){
                System.out.print("Enter Person Id- ");
                int pid = sc.nextInt();
                sc.nextLine();
                Person p = em.find(Person.class,pid);
                System.out.println(p.getName()+" "+p.getDl().getDlNo());
                if (p != null){
                    DL dl = em.find(DL.class,p.getDl().getDlNo());
                    if (dl != null){
                        System.out.println(dl.getDlNo()+" "+dl.getExpDate()+" "+dl.getIssueDate());
                    }
                    else{
                        System.out.println("NO DL Found");
                    }
                }
                else{
                    System.out.println("Person Not Find");
                }
            }
            else if(choice==10){
                break;
            }
            else if (choice == 3){
                System.out.println("Enter Person Id: ");
                int pid = sc.nextInt();
                sc.nextLine();
                Person p = em.find(Person.class,pid);
                if (p != null){
                    em.remove(p);
                }
            }
            else if (choice==4){
                System.out.print("Enter Pid- ");
                int pid = sc.nextInt();
                sc.nextLine();
                Person p = em.find(Person.class,pid);
                if (p!=null){
                    DL dl = em.find(DL.class,p.getDl().getDlNo());
                    System.out.print("Enter Expiry Date - (DD MM YYYY)- ");
                    int dd = sc.nextInt();
//                    sc.nextLine();
                    int mm = sc.nextInt();
//                    sc.nextLine();
                    int yyyy = sc.nextInt();
                    sc.nextLine();

                    dl.setExpDate(LocalDate.of(yyyy,mm,dd));
                }
            }
        }
        em.getTransaction().commit();

    }
}
