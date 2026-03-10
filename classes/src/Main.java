//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mahi",20,21);
        Student s2 = new Student("Mahi",50,30);
//        if (s1 == s2){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
//        if (s1.equals(s2)){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }
//        System.out.println(s1.name == s2.name);
//        System.out.println((s1.name).equals(s2.name));

        System.out.println("Student1 Data");
        System.out.println("Name- "+s1.name+", Roll No- "+s1.roll_no+", Age- "+s1.age);
        System.out.println("Student2 Data");
        System.out.println("Name- "+s2.name+", Roll No- "+s2.roll_no+", Age- "+s2.age);

    }
}



class Student{
    String name;
    Integer roll_no;
    Integer age;


//    This is Constructor (public Student())
    public Student(String name,Integer roll_no,Integer age){
        this.name=name;
        this.age = age;
        this.roll_no = roll_no;
    }
}