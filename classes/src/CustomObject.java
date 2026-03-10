import javax.xml.namespace.QName;
import java.util.ArrayList;

public class CustomObject {
    public static void main(String[] args) {
        ArrayList<Job> emp = new ArrayList<>();
        emp.add(new Job(1,"Vinay Kumar",1000));
        emp.add(new Job(2,"Luvv Kumar",2000));
        emp.add(new Job(3,"Shreshtha",2000));
        emp.add(new Job(4,"Samar",4000));

        for (Job curr:emp){
            curr.get_details();
            System.out.println();
        }

    }
}

class Job{
    private Integer id;
    private String name;
    private Integer sal;
    public Job(Integer id,String name,Integer sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public void get_details(){
        System.out.println("Name : "+this.name);
        System.out.println("Job Id : "+this.id);
        System.out.println("Salary : "+this.sal);

    }
}