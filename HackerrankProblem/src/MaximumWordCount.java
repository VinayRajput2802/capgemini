import java.util.Scanner;
public class MaximumWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        int ans = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int asc = c;
            asc = asc-97;
            arr[asc]++;
            ans = Math.max(ans,arr[asc]);
        }
        System.out.println(ans);
    }
}
