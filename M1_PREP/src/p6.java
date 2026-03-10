import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] ips = new int[n];
        int[] tasks = new int[n];
        int[] timeStamp = new int[n];
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();

        for (int i=0;i<n;i++){
            int ip = sc.nextInt();
            map.put(ip,new LinkedList<>());
            tasks[i] = ip;
        }
        sc.nextLine();
        for (int i=0;i<n;i++){
            int time = sc.nextInt();
            timeStamp[i] = time;
        }
        sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();
        int t = sc.nextInt();
        sc.nextLine();


        for (int i=0;i<n;i++){
            int ip = tasks[i];
            int time = timeStamp[i];
            int last_time = time-t;
            while (!map.get(ip).isEmpty() && map.get(ip).peekFirst()<=last_time){
                map.get(ip).pollFirst();
            }
            map.get(ip).offerLast(time);
            if (map.get(ip).size()>k){
                ips[ip] = 1;
            }
        }
        for (int i=0;i<n;i++){
            if (ips[i]==1){
                System.out.print(i+" ");
            }
        }
    }
}
