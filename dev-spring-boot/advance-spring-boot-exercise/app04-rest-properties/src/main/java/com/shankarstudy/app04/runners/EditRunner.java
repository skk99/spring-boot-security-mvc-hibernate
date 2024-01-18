package com.shankarstudy.app04.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(100)
@SpringBootApplication
public class EditRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello User, this is from Editor Runner from CommandLineRunner....");
//        for (String str : args) {
//            System.out.println(str);
//        }
    }
}
