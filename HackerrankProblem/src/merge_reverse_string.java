import java.util.Scanner;

public class merge_reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int r = s.length()-1;
        char prev = ' ';
        String ans = "";
        for (int i=r;i>=0;i--){
            char c = s.charAt(i);
            if (c == prev){
                continue;
            }
            ans += c;
            prev = c;
        }
        System.out.println(ans);
    }
}
