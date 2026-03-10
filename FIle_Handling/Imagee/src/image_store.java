import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class image_store {
    public static void main(String[] args) {
        String sourcePath = "Imagee\\src\\img.png";
        String destinationPath = "immmg\\img_copied.png";
        try{
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[1024];
            int bytesRead;
            int size = 0;
            while((bytesRead = fis.read(buffer)) != -1){
                size++;
            }


            fis.close();
            fos.close();
            System.out.println(size+" byte");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
