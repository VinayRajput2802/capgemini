import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i=0;i<n;i++){
            int time = sc.nextInt();
            start[i] = time;
        }
        sc.nextLine();
        for (int i=0;i<n;i++){
            int time = sc.nextInt();
            end[i] = time;
        }
        int t = sc.nextInt();
        int curr = 1;
        int ans = 0;
        for (int i=0;i<n;i++){
            int s = start[i];
            int e = end[i];
            ans += Math.max(s-curr-1,0);
            curr = Math.max(curr,e);
        }
        ans += Math.max(t-curr,0);
        System.out.println(ans);
    }
}

