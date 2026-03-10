import java.util.function.Function;

public class fifth {
    public static void main(String[] args) {
        Function<Integer,Integer> factRef = Factorial::factorial;
        System.out.println(factRef.apply(5));
    }
}


interface Calculate{
    int calculate(int n);
}

class Factorial{
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}