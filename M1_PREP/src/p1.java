import java.util.*;

public class p1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] timeStamp = new int[n];
        String[] tasks = new String[n];
        String[] users = new String[n];
        for (int i=0;i<n;i++){
            int time = sc.nextInt();
            sc.nextLine();
            timeStamp[i] = time;
        }
        int size = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> session = new HashMap<>();
        for (int i=0;i<size;i++){
            String user = sc.nextLine();
            users[i] = user;
        }


        for (int i=0;i<size;i++){
            String task = sc.nextLine();
            tasks[i] = task;
        }
        int m = sc.nextInt();
        sc.nextLine();

        List<String> ans = new ArrayList<>();
        Set<String> already = new HashSet<>();

        for (int i=0;i<size;i++){
            String user = users[i];
            if (tasks[i].equals("login")){
                session.put(user,session.getOrDefault(user,0)+1);
                if ((session.get(user) > m) && (!already.contains(user))){
                    ans.add(user);
                    already.add(user);
                }

            }
            else{
                session.put(user,Math.max(0,session.get(user)-1));
            }
        }
        Collections.sort(ans);
        for (String val:ans){
            System.out.print(val+" ");
        }

    }
}

