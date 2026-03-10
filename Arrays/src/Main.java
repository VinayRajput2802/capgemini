import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Integer> new_copy = new CopyOnWriteArrayList<>(); // It does not delete data they change the data into for each loop after iteration of For Each loop they delete
        new_copy.add(1);
        new_copy.add(2);
        new_copy.add(3);
        for(Integer a: new_copy) {
            if (a.equals(1)){
                new_copy.remove(a);
            }
            System.out.println(a);
        }
        new_copy.set(0,22);
        for (Integer a:new_copy){
            System.out.println(a);
        }
    }
}