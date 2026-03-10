public class AverageValueOfEvenIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 62, 4};
        int n = arr.length;
        int even_count = (n + 1) / 2;
        int even_sum = 0;
        for (int i = 0; i < n; i = i + 2) {
            even_sum = even_sum + arr[i];
        }
        double avg_even = (double) even_sum/even_count;
        System.out.println(avg_even);
    }
}
