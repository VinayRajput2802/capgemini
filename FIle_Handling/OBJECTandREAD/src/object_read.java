import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class object_read {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OBJECTandREAD/Test.txt"))){
            while(true){
                Student s1 = (Student) ois.readObject();
                System.out.print("Name: " + s1.get_name() + " --- ");
                System.out.println("id: " + s1.get_id());
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
