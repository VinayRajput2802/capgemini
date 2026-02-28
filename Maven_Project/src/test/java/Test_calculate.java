import org.example.Calculator;
import org.example.Prime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_calculate {
    static Calculator calculator;
    static Prime prime;
    @BeforeAll
    public static void init(){
        prime = new Prime();
        calculator = new Calculator();
        System.out.println("Object Created for Prime and Calculator");
    }
    @Test
    public void calTest(){
        for (int i=0;i<20;i++) {
            int a = (int) (Math.random() * 100) + 1;
            int b = (int) (Math.random() * 100) + 1;
            assertEquals((a + b), calculator.calculate(a, b));
        }
    }
    @Test
    @Timeout(1)
    public void primeTest(){
        int a = 7;
        assertEquals(true,prime.isPrime(a));
    }
    @AfterAll
    public static void destroy(){
        prime = null;
        calculator = null;
        System.out.println("Object Destroyed for Prime and Calculator");
    }

}
