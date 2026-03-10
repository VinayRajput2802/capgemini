public class MinValueInFirstHalf {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int min_val = Integer.MAX_VALUE;
        int n = arr.length;
        int mid = n/2;
        for (int i=0;i<mid;i++){
            if (arr[i] < min_val){
                min_val=arr[i];
            }
        }
        System.out.println(min_val);
    }
}
