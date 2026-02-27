import java.io.*;

//public class Exercise1 {
//    public static void main(String[] args) {
//        try {
//            File file = new File("source.txt");
//            File file1 = new File("Target.txt");
//            if (file.createNewFile()){
//                System.out.println("File created");
//            }
//            else{
//                System.out.println("File already exists");
//            }
//            if (file1.createNewFile()){
//                System.out.println("File created");
//            }
//            else{
//                System.out.println("File already exists");
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error Error");
//        }
//        try{
//            FileReader reader = new FileReader("source.txt");
////            BufferedReader bufferedReader = new BufferedReader(reader);
//            int c;
//            while ((c= reader.read()) != -1){
//                System.out.println((char) c);
//            }
//            reader.close();
//        }
//        catch (IOException e) {
//            System.out.println("Error opening file");
//        }
//    }
//}
class CopyDataThread extends Thread{
    int copy_data = 0;
    public void run(){
        try {
            FileReader reader = new FileReader("source.txt");
            FileWriter writer = new FileWriter("Target.txt");
            int ch;
            while ((ch=reader.read()) != -1) {
//                System.out.println((char) ch);
                writer.write(ch);
                copy_data++;
                if (copy_data % 10 == 0) {
                    Thread.sleep(500);
                    System.out.println("10 Character Copied");
                }
            }
            writer.close();
            System.out.println("Full Data Copied");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}

class FileProgram{
    public static void main(String[] args) {
        CopyDataThread copyDataThread = new CopyDataThread();
        copyDataThread.start();
    }
}