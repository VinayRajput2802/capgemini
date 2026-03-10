import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        int[] users = new int[n];
        for (int i=0;i<n;i++){
            int user = sc.nextInt();
            map.put(user,new LinkedList<>());
            users[i] = user;
        }
        sc.nextLine();

        int[] timeStamp = new int[n];
        for (int i=0;i<n;i++){
            int time = sc.nextInt();
            timeStamp[i] = time;
        }
        sc.nextLine();
        int k = sc.nextInt();
        int[] ans = new int[n];
        for (int i=0;i<n;i++){
            int time = timeStamp[i];
            int user = users[i];
            int last = time-60;
            while (!map.get(user).isEmpty() && map.get(user).peekFirst()<=last){
                map.get(user).pollFirst();
            }
            if (!map.get(user).isEmpty() && map.get(user).size()==k){
                ans[i] = 0;
            }
            else{
                map.get(user).offerLast(time);
                ans[i] = 1;
            }
        }
        for (int i:ans) {
            System.out.println(i);
        }
    }
}
