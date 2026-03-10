import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class object_write {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println(id+" "+name);
        Student student = new Student(id,name);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OBJECTandREAD/Test.txt",true));
            oos.nextLine()
            oos.writeObject(student);
            System.out.println("Object Saved Successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
