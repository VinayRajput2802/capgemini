package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        while (true){
            System.out.println("Add New Author    - - -  1");
            System.out.println("Display ALL     - - - -  2");
            System.out.println("Change Book Price - - -  3");
            System.out.println("Delete Book - - - - - -  4");
            System.out.println("Delete Author - - - - -  5");
            System.out.println("Exit -  -  -  -  -  -  - 10");
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                service.addAuthor();
            }
            else if(choice==2){
                service.DisplayAll();
            }
            else if(choice==3){
                service.updatePrice();
            }
            else if(choice==4){
                service.deleteBook();
            }
            else if(choice==5){
                service.deleteAuthor();
            }
            else if (choice == 10){
                break;
            }
        }


    }
}