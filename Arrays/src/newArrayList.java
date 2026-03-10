import java.util.ArrayList;
import java.util.Iterator;

public class newArrayList {
    public static void main(String[] args) {

//        This is For different data type
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add("Vinay");
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

//        This is for same data Type
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        for (int i:arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
//        Print Using Iterator Method
        Iterator cursor = arr.iterator();
        while (cursor.hasNext()){
            System.out.print(cursor.next()+" ");
        }
    }
}
