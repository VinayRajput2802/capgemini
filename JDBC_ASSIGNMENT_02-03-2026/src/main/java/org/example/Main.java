package org.example;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Add BOOK ----------  1");
                System.out.println("Add AUTHOR --------- 2");
                System.out.println("AUTHOR'S BOOKS- NAME 3 ");
                System.out.println("AUTHOR'S BOOKS BY ID 4");
                System.out.println("ALL BOOKS ---------- 5");
                System.out.println("EXIT --------------- 10");
                System.out.println("Enter Your Choice : ");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    InsertBookData writer = new InsertBookData();
                    System.out.print("Enter ISBN no- ");
                    Long isbn = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter Title- ");
                    String title = sc.nextLine();
                    System.out.println("Enter Price- ");
                    Integer price = sc.nextInt();

                    writer.insertData(new BOOKS(title, isbn, price));

                } else if (choice == 2) {
                    InsertAuthorData writer = new InsertAuthorData();
                    System.out.print("Enter First Name: ");
                    String Fname = sc.nextLine();
                    System.out.print("Enter Middle Name: ");
                    String Mname = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String Lname = sc.nextLine();
                    System.out.print("Enter Id: ");
                    Integer id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phn_no = sc.nextLine();
                    writer.insertData(new Author(Fname, Mname, Lname, id, phn_no));

                } else if (choice == 3) {
                    FindAllBooks find = new FindAllBooks();
                    System.out.print("Enter First Name: ");
                    String Fname = sc.nextLine();
                    System.out.print("Enter Middle Name: ");
                    String Mname = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String Lname = sc.nextLine();
                    find.findByName(Fname, Mname, Lname);
                } else if (choice == 4) {
                    FindAllBooks find = new FindAllBooks();
                    System.out.println("Enter Author Id: ");
                    int id = sc.nextInt();
                    find.findById(id);
                    sc.nextLine();
                } else if (choice == 5) {
                    AllBooks.All();
                } else if (choice == 10) {
                    break;
                } else {
                    System.out.println("Enter Valid Choice");
                }

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}