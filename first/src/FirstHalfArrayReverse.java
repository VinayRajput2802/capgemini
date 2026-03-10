import java.util.Arrays;
public class FirstHalfArrayReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n = arr.length;
        int r = n/2;
        int l = 0;
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
