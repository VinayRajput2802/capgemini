import java.util.Arrays;
public class Minimum_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,5,-5};
        int min_element = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (min_element>arr[i]){
                min_element = arr[i];
            }
        }
        System.out.println(min_element);
    }
}
