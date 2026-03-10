import java.util.Arrays;
public class Average {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int size = arr.length;
        int sum = 0;
        for (int i=0;i<size;i++){
            sum = sum+arr[i];
        }
        double avg = (double) sum/size;
        System.out.println(avg);
    }
}
