import java.util.LinkedList;

public class basic {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.addFirst(0);
        head.addLast(5);
        System.out.println(head);
        for (int i:head){
            System.out.println(i);
        }
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add('a');
        ll.add("hello world");
        System.out.println(ll);
    }
}
