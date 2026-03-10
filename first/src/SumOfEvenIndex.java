public class SumOfEvenIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int even_sum=0;
        for (int i=0;i<arr.length;i=i+2){
            even_sum = even_sum+arr[i];
        }
        System.out.println("Sum of Even Number Index is "+even_sum);
    }
}
