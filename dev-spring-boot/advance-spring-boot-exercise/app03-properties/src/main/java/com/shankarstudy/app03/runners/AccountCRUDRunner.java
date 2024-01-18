package com.shankarstudy.app03.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(400)
@SpringBootApplication
public class AccountCRUDRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is from AccountCRUDRunner");
    }
}
