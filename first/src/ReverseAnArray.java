import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int n = arr.length;
        int [] rev = new int[n];
        int l = 0;
        int r = n-1;
        while (l<r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
