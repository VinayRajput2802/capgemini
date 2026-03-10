import java.util.Arrays;

public class ReverseOddIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int l = 1;
        int r = n-1;
        if (r%2 == 0){
            r--;
        }
        while (l<r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l = l+2;
            r = r-2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
