import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
public class RightShiftElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Original Array- ");
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int tmp = arr[n-1];
        for (int i=0;i<n;i++){
            int new_tmp = arr[i];
            arr[i] = tmp;
            tmp = new_tmp;
        }
        System.out.print("One Right Shift- ");
        System.out.println(Arrays.toString(arr));

        int[] brr = {1,2,3,4,5};
        n = brr.length;
        Queue<Integer> q = new LinkedList<>();
        for (int i=n-2;i<n;i++){
            q.add(brr[i]);
        }
        for (int i=0;i<n;i++){
            q.add(brr[i]);
            int val = q.remove();
            brr[i] = val;
        }
        System.out.print("Two Right Shift- ");
        System.out.println(Arrays.toString(brr));
    }
}
