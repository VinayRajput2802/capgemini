import java.util.ArrayList;
import java.util.ListIterator;

public class revArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Through Recursion :");
        back(0,arr);
        System.out.println();
        System.out.println("Iterator");
        ListIterator li = arr.listIterator(arr.size());
        while (li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
    }
    public static void back(Integer i,ArrayList arr){
        if (i==arr.size()){
            return;
        }
        back(i+1,arr);
        System.out.print(arr.get(i)+" ");
    }
}
