import java.util.Arrays;
public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {5,2,14,62,8,-2,55};
        int m0 = Integer.MIN_VALUE;
        int m1 = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if (m0 < arr[i]){
                m1 = m0;
                m0 = arr[i];
            }
            else if(m1<arr[i]){
                m1 = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("2nd Maximum element is : "+m1);
    }


}
