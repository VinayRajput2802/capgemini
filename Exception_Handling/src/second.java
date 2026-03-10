import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Length- ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter Index");
            int ind = sc.nextInt();
            arr[ind] = 5;
            System.out.println("Exicuted Successfully !");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Index Error!");
        }
        catch (InputMismatchException e){
            System.out.println("Input Mismatch");
        }

    }
}
