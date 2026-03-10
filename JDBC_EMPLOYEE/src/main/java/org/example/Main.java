package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("1 -- Write Data");
            System.out.println("2 -- Find Data");
            System.out.println("3 -- Update Data");
            System.out.println("4 -- Delete Data");
            System.out.println("5 -- Exit");
            System.out.print("Enter Your Choice - ");
            try {
                int x = sc.nextInt();
                sc.nextLine();

                if (x==2) {
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();

                    find_data finder = new find_data();
                    finder.findByName(name);
                }
                else if(x==1) {
                    WriteData writer = new WriteData();
                    String id;
                    System.out.print("Enter Name :");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    int salary = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter DOB(DD-MM-YYYY): ");
                    String dob = sc.nextLine();
                    if (dob.length() != 10){
                        System.out.println("Date Of Birth not in format");
                        continue;
                    }
                    if (name.length() >= 3) {
                        id = name.substring(0, 3);
                    }
                    else{
                        id = name;
                    }
                    id += dob.substring(6);
                    writer.insertStudent(new Employee(name,salary,dob,id));

                }
                else if(x==3){
                    System.out.print("Enter name to update: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int age = sc.nextInt();

                    UpdateData updater = new UpdateData();
                    updater.updateAgeByName(name, age);
                }
                else if(x==4){
                    System.out.print("Enter name to delete: ");
                    String name = sc.nextLine();

                    DeleteData deleter = new DeleteData();
                    deleter.deleteByName(name);
                }
                else{
                    break;
                }
                System.out.println("--------------------------------------------------------");
            }
            catch (RuntimeException e) {
                sc.nextLine();
                System.out.println("----- Enter Valid Choice ------");
            }
        }
        sc.close();
    }
}