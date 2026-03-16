package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstSpringBootAppApplication.class, args);
		HelloWorld h = ctx.getBean(HelloWorld.class);
		System.out.println(h.sayHello("ok"));
		Employee emp =(Employee) ctx.getBean(Employee.class);
		System.out.println(emp.getName());

	}
}
