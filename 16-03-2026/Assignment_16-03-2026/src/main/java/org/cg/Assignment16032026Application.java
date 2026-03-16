package org.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("classpath:data.properties")
public class Assignment16032026Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Assignment16032026Application.class, args);
        SBU emp = ctx.getBean(SBU.class);

        System.out.println(emp.getSbuHead());

    }

}
