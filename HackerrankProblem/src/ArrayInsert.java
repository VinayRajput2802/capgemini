import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr = new int[l];
        for (int i =0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] ans = new int[l+1];
        boolean check = false;
        for (int i=0;i<l;i++){
            if (x < arr[i] && !check){
                check = true;
                ans[i] = x;
            }
            if (check){
                ans[i+1] = arr[i];
            }
            else{
                ans[i] = arr[i];
            }
        }
        if (!check){
            ans[l] = x;
        }
        System.out.print(Arrays.toString(ans));
    }
}
