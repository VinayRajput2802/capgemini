import java.util.Scanner;

public class MaximumLengthOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int ans = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == ' '){
                count = 0;
                continue;
            }
            count++;
            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
