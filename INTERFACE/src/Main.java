//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements A{
    public static void main(String[] args) {
        Main m = new Main();
        m.m1();
        m.m2();
        m.m3();  // You can run default method with override or Interface method
        A.fixed_data();  // You can run static file with only interface name
    }

    @Override
    public void m1() {
        System.out.println("M1");
    }

    @Override
    public void m2() {
        System.out.println("M2");
    }
}

interface A {
    public void m1();
    public void m2();
    public static void fixed_data(){
        System.out.println("Fixed data");
    }
    public default void m3(){
        System.out.println("m3");
    }
}

