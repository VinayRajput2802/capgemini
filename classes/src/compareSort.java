import java.util.Comparator;
import java.util.*;

public class compareSort {
    public static void main(String[] args) {
        LinkedList<Job1> ll = new LinkedList<>();
        ll.add(new Job1(1,"Vinay",1000));
        ll.add(new Job1(2,"Luvv Kumar",2500));
        ll.add(new Job1(3,"Shreshtha",2000));
        ll.add(new Job1(4,"Samar",500));

        Collections.sort(ll,new SalSorter());
        while(!ll.isEmpty()){
            Job1 val = ll.getFirst();
            ll.removeFirst();
            val.details();
        }
    }

}

class SalSorter implements Comparator<Job1> {
    public int compare(Job1 j1,Job1 j2){
        return j1.sal-j2.sal;
    }
}


class Job1{
    private Integer id;
    private String name;
    Integer sal;
    public Job1(Integer id,String name,Integer sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    void details(){
        System.out.println(this.name+" "+this.id+" "+this.sal);
    }

}
