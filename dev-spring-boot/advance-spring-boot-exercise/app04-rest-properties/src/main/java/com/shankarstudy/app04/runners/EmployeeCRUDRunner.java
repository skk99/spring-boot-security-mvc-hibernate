package com.shankarstudy.app04.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(300)
@SpringBootApplication
public class EmployeeCRUDRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is from EmployeeCRUDRunner");
    }
}
