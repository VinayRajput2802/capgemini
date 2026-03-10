import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] timeStamp = new int[n];
        for (int i=0;i<n;i++){
            int time = sc.nextInt();
            timeStamp[i] = time;
        }
        int window_size = sc.nextInt();

        int ans = 0;
        for (int i=0;i<n;i++){
            int time = timeStamp[i];
            int target = time+window_size-1;
            int l = i;
            int r = n-1;
            while (l<=r){
                int mid = l+(r-l)/2;
                if (timeStamp[mid] <= target){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            ans = Math.max(l-i,ans);


        }
        System.out.println(ans);
    }
}
