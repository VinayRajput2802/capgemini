import java.util.Arrays;
import java.util.Scanner;
public class ArrayInputInOneLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<5;i++){
            int val=sc.nextInt();
            arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
