import java.util.ArrayList;
import java.util.TreeSet;

public class forth {
    public static void main(String[] args) {

//        Object[] arr ={1,"ABC",'a'}; // Array Store heterogenious type using Objects.
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        TreeSet tr = new TreeSet<>();
//        tr.add(null); // Null Pointer Exception


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (Integer a : arr){
            if (a.equals(1)){
                arr.remove(a);
            }
            System.out.println(a);
        }

    }
}
