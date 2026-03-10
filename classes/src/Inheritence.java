import org.w3c.dom.ls.LSOutput;

public class Inheritence {
    public static void main(String[] args) {
        Animal1 obj = new Animal1();
        obj.eating();
        Animal1[] arr =  {new Animal1(),new Dog1(),new Animal1()};
        for (Animal1 obj1 : arr) {
            obj1.eating();
            if (obj1 instanceof Dog1) {
                ((Dog1) obj1).bark();
            }
        }
    }
}
class Animal1{
    public void eating()
    {
        System.out.println("Animal is Eating");
    };
}
class Dog1 extends Animal1{
    public void eating(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("Dog is Barking");
    }
}

