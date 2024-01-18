package com.shankarstudy.app03.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(200)
@SpringBootApplication
public class StudentCRUDRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is from StudentCRUDRunner");
    }
}
