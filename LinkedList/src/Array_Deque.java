import java.util.ArrayDeque;
import java.util.Deque;
public class Array_Deque {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
//        q.addFirst(100);
        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        q.addFirst(4);
        q.addFirst(5);
        System.out.println(q);
        while (!q.isEmpty()){
            int f = q.removeFirst();
            System.out.println("First "+f);
            if (q.isEmpty()){
                continue;
            }
            int l = q.removeLast();
            System.out.println("last "+l);
        }
    }
}
