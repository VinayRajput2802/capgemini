import java.util.Scanner;
public class characterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        System.out.print("Enter Character: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
