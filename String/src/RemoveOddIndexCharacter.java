import java.util.Scanner;

public class RemoveOddIndexCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        String ans="";
        char c;

        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            if (i%2==1){
                continue;
            }
            else{
                ans += c;
            }
        }
        System.out.println(ans);

    }
}
