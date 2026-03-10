import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writing_in_file {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("Test.txt",true));
            writer.newLine();
            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Your Course: ");
            String course = sc.nextLine();
            writer.write("name" + ":" + name);
            writer.newLine();
            writer.write("course" + ":" + course);
            writer.close();
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

