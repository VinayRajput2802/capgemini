public class MinimumElementAtEvenIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,0,4,56,7};
        int min_element = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i=i+2){
            if (min_element>arr[i]){
                min_element = arr[i];
            }
        }
        System.out.println(min_element);
    }
}
