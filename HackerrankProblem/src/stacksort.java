import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stacksort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            Stack<Integer> s = new Stack<>();
            Stack<Integer> b = new Stack<>();
            boolean ans=true;
            for (int j=0;j<n;j++){
                int num = arr[j];
                while (!s.isEmpty() && (num>s.peek())){
                    b.push(s.pop());
                }
                s.push(num);
            }
            while (!s.isEmpty()){
                b.push(s.pop());
            }
            int last = b.pop();
            while (!b.isEmpty()){
                int a = b.pop();
                if (a>last){
                    ans = false;
                }
                last = a;
            }
            System.out.println(ans);
        }
    }
}
