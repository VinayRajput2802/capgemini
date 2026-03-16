package org.cg;

import org.cg.entity.Employee;
import org.cg.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringBootJpaApplication.class, args);
        IEmployeeRepo erepo = ctx.getBean(IEmployeeRepo.class);
        erepo.save(new Employee("Vinay Kumar", LocalDate.of(2004,2,28),50000));
        System.out.println("Employee Created");

    }

}
