class GrandParent{
    void m1(){
        System.out.println("Grand Parent");
    }
}
class Parent extends GrandParent{
    void m2(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void m3(){
        System.out.println("Child");
    }
}

public class Multi_level_inheritence {

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        System.out.println("   v    ");
        c.m2();
        System.out.println("   v    ");
        c.m3();
    }
}
