import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Fille {
    public static void main(String[] args) {
        try{
            File file = new File("Text.txt");
            if (file.createNewFile()){
                System.out.println("File created: "+file.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println("File closed");
        }
    }
}

class Write{
    void write(java.io.File file){
        Scanner sc = new Scanner(System.in);

    }
}
