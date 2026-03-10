import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class previous_smaller_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int m = Integer.MAX_VALUE;
            Stack<Integer> stack = new Stack<>();
            for (int i=0;i<n;i++){
                int temp = sc.nextInt();
                while (!stack.isEmpty() && (stack.peek()>temp)){
                    stack.pop();
                }
                arr[i] = -1;
                if (!stack.isEmpty()){
                    arr[i] = stack.peek();
                }
                stack.push(temp);
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
