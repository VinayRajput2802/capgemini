import org.example.Calculator;
import org.example.Prime;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
//    @Test
//    @Disabled  // This is used for Disabling the test

    @ParameterizedTest
    @ValueSource(ints={13,17,23,5,2})
    @Timeout(value=2)
    public void primeTest(int n){

        assertTrue(prime.isPrime(n));
//        assertTrue(prime.isPrime(100));
//        assertTrue(prime.isPrime(331));
    }
    @AfterAll
    public static void destroy(){
        prime = null;
        calculator = null;
        System.out.println("Object Destroyed for Prime and Calculator");
    }


}