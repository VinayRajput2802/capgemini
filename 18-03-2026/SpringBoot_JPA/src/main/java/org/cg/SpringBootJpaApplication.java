package org.cg;

import org.cg.entity.Employee;
import org.cg.entity.EmployeeService;
import org.cg.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class SpringBootJpaApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringBootJpaApplication.class, args);
        EmployeeService es = ctx.getBean(EmployeeService.class);

//        es.getEmployeeByName("Luvv").forEach(e-> System.out.println(e.getName()));
        es.getEmployeeBornInParticularMonth(2).forEach(e-> System.out.println(e.getName()));


    }
}
