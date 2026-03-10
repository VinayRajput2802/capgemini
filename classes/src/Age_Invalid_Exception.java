//package.main.java.exception;
import java.util.*;
public class Age_Invalid_Exception {
    public static void validateAge(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age Must be 18 or Above");
        }
        else {
            System.out.println("Valid age");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int age;
            System.out.println("Enter Your Age");
            age = sc.nextInt();
            try{
                validateAge(age);
                break;
            }
            catch(InvalidAgeException e){
                System.out.println(e.getMessage());
            }

        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}