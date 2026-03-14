package com.cg.main;

import com.cg.bean.*;
import org.springframework.beans.factory.support.ScopeNotActiveException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");


//        Car honda = (Car) ctx.getBean("car");
//        honda.setEngine((CNGengine) ctx.getBean("cng"));
//        honda.setTyre((JKtyre) ctx.getBean("jk"));
//        honda.PrintCarDetails();

        System.out.println("Engine Available (cng or petrol): ");
        String engineType = sc.nextLine();
        System.out.println("Tyre Available (jk or mrf): ");
        String tyreType = sc.nextLine();

        IEngine engine = (IEngine) ctx.getBean(engineType);
        ITyre tyre = (ITyre) ctx.getBean(tyreType);

        Car honda = (Car) ctx.getBean("car");
        honda.setTyre(tyre);
        honda.setEngine(engine);

        honda.PrintCarDetails();
    }
}
