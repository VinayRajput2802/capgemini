import java.util.Arrays;
import java.util.Scanner;

public class first_array_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("Enter value at index "+i+" - ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
