import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] apiIndex = new int[n];
        int[] tasks = new int[n];

        for (int i=0;i<n;i++){
            int idx = sc.nextInt();
            tasks[i] = idx;
        }
        sc.nextLine();
        int[] loads = new int[n];
        for (int i=0;i<n;i++){
            int load = sc.nextInt();
            loads[i] = load;
        }
        sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();
        Integer[] indexes = new Integer[n];
        for (int i=0;i<n;i++){
            indexes[i] = i;
        }

        for (int i=0;i<n;i++){
            int idx = tasks[i];
            int load = loads[i];
            apiIndex[idx] += load;
        }
        Arrays.sort(indexes,(a,b)->apiIndex[b]-apiIndex[a]);


        for (int i=0;i<k;i++){
            int val = indexes[i];
            if (apiIndex[val] > 0) {
                System.out.println(val+ " ");
            }
        }


    }
}
