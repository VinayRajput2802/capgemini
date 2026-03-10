import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.next();

        System.out.print("Enter A: ");
        char a = sc.next().charAt(0);

        System.out.print("Enter B: ");
        char b = sc.next().charAt(0);

        char curr;
        String ans="";
        for (int i=0;i<s.length();i++){
            curr = s.charAt(i);
            if (curr==a){
                ans += b;
            }
            else{
                ans += curr;
            }
        }

        System.out.println("Resultant String: "+ans);

    }
}
