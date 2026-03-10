import java.util.Scanner;
public class Encapsulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Balance: ");
        int bal = sc.nextInt();


        b.setName(name);
        b.setAge(age);
        b.setBalance(bal);

    }
}


class Bank{

    private String name;
    private Integer age;
    private Integer bal;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        if (age >= 18){
            this.age = age;
        }
        else{
            System.out.println("Age Minimum requirement is 18");
        }
    }

    public void setBalance(Integer bal){
        if (bal >= 0){
            this.bal = bal;
        }
        else{
            System.out.println("Balance must be positive");
        }
    }
}