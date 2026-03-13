package com.cg.main;

import com.cg.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld h = (HelloWorld) ctx.getBean("Hello");
        HelloWorld h1 = (HelloWorld) ctx.getBean("Hello");
        h.setName("Vinay");
//        h1.setName("Aarush");
        System.out.println(h.SayHello());
        System.out.println("=============");
        System.out.println(h.getLanguage());
//        System.out.println(h1.SayHello());
//        ((ClassPathXmlApplicationContext)ctx).close();
    }
}