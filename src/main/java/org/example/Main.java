package org.example;

import java.net.SecureCacheResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee_Service es = new Employee_Service();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add Employee ----- 1");
        System.out.println("Change Name ------ 2");
        System.out.println("Change salary ---- 3");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice==1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Job: ");
            String job = sc.nextLine();
            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();
            es.AddEmployee(new Employee(id, name, job, salary));
        }
        else if (choice==2){
            System.out.print("Enter Employee Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            Employee emp = es.find_employee(id);
            if (emp!=null) {
                es.UpdateName(emp);
            }
            else{
                System.out.println("NO EMPLOYEE FOUND");
            }
        }
        else if(choice==3){
            System.out.print("Enter Employee Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            Employee emp = es.find_employee(id);
            es.UpdateSalary(emp);
        }
    }
}