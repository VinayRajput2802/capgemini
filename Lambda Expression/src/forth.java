import java.util.function.Supplier;

public class forth {
    public static void main(String[] args) {
        Supplier<A> li = A::new;
        A a = li.get();
        a.setName("Vinay");
        a.setName("Rohit");

        System.out.println(a.getName());
    }
}


class A{
    private String name;
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}

interface Student{
    String name(A o);
}