import java.io.*;

public class read_file {
    public static void main(String[] args) {
        try{
            BufferedReader file_reader = new BufferedReader(new FileReader("Test.txt"));
            String line;
            while((line=file_reader.readLine())!=null) {
                System.out.println(line);
            }
            file_reader.close();
        }
        catch (IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
}
