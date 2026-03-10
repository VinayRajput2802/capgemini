import java.util.Scanner;
import java.util.Arrays;
public class mountain_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        int[] ans = new int[n];
        for (int i=0;i<n;i++){
            if (i%2==0){
                ans[i] = arr[l];
                l++;
            }
            else{
                ans[i] = arr[r];
                r--;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}