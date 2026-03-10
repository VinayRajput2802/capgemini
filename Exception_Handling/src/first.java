import java.util.InputMismatchException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter First Number: ");
            int a = sc.nextInt();
            System.out.println("Enter Second Number: ");
            int b = sc.nextInt();
            int result = a/b;
        }

        catch(ArithmeticException e){

            System.out.println(e.getMessage()); // this is default message
            System.out.println("Not divide by zero");
        }
        catch(InputMismatchException e) {
            System.out.println("Input Error!");
        }
        catch(RuntimeException e){
            System.out.println("run");
        }
    }
}
