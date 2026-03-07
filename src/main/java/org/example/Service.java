package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
    EntityManager em = emf.createEntityManager();
    Scanner sc = new Scanner(System.in);
    public void addAuthor(){
        System.out.println("Enter Author Id: ");
        int authId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Email: ");
        String mail = sc.nextLine();
        Authors author = new Authors(authId,name,mail);
        System.out.println("Add Books");
        author.setTotalBooks(addBooks(author));
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
    }
    public List<Books> addBooks(Authors author){
        List<Books> book = new ArrayList<>();
        while (true){
            System.out.println("Enter Book Name(Or exit): ");
            String book_name = sc.nextLine();
            if (book_name.equals("exit") || book_name==null){
                break;
            }
            System.out.println("Enter Price: ");
            int price = sc.nextInt();
            sc.nextLine();

            book.add(new Books(book_name,price,author));
        }
        return book;
    }

    public void DisplayAll(){
        List<Authors> authors = em.createQuery("select e from Authors e",Authors.class).getResultList();
        for (Authors auth:authors){
            if (auth==null){
                continue;
            }
            System.out.println("Author Id- "+auth.getAuthorId());
            System.out.println("Author Name- "+auth.getAuthorName());
            System.out.println();
            System.out.println("Books Written");
            List<Books> books = auth.getTotalBooks();
            for (Books book:books){
                System.out.println(book.getTitle()+" -> "+book.getPrice());
            }
        }
    }
    public void updatePrice(){
        Books book = findBook();
        if (book == null){
            System.out.println("No Book Found");
        }
        else {
            System.out.println("Enter New Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            em.getTransaction().begin();
            book.setPrice(price);
            em.getTransaction().commit();
        }
    }

    public void deleteBook(){
        Books book = findBook();
        if (book == null){
            System.out.println("No Book Found");
        }
        else {
            em.getTransaction().begin();
            em.remove(book);
            em.getTransaction().commit();
            System.out.println("Delete Successfull");
        }
    }
    public void deleteAuthor(){
        Authors author = findAuthor();
        if (author==null){
            System.out.println("NO Author Found");
        }
        else {
            em.getTransaction().begin();
            em.remove(author);
            em.getTransaction().commit();
            System.out.println("Author Delete Successfully");
        }
    }

    public Authors findAuthor(){
        System.out.println("Enter Author Id: ");
        int auth_id = sc.nextInt();
        sc.nextLine();
        Authors author = em.find(Authors.class,auth_id);
        return author;
    }
    public Books findBook(){
        System.out.println("Enter Book Id: ");
        int book_id = sc.nextInt();
        Books book = em.find(Books.class,book_id);
        return book;
    }
}

