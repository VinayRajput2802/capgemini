import java.io.File;

public class Folder {
    public static void main(String[] args) {
        File folder = new File("myFolder");
        if (folder.mkdir()) {
            System.out.println("Folder created") ;
        }
        else{
            System.out.println("Failed to create folder");
        }
    }
}
