public class Overrride {
    public static void main(String[] args) {
        Animal obj  = new Animal();
        obj.eat();

    }
}

class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{

    void eat() {
        System.out.println("Dog eat");
    }
}

