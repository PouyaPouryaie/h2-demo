package ir.bigz.spring.h2demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class H2DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(H2DemoApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(H2DemoApplication.class, args);
        Object dataSource = context.getBean("dataSource");
        System.out.println(dataSource);
    }

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepo employeeRepo) {
        return args -> {
            System.out.println("Start run command");
            Employee pouya = Employee.builder().firstName("pouya").lastName("pouryaie").email("pouyapouryaie@gmail.com").build();
            Employee sina = Employee.builder().firstName("sina").lastName("tadayon").email("sinatadayon@gmail.com").build();
            employeeRepo.saveAll(List.of(pouya, sina));

            System.out.println("data found is" + employeeRepo.findAll());
        };
    }
}
