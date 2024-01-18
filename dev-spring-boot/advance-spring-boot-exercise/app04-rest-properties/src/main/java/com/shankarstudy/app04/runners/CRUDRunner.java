package com.shankarstudy.app04.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(500)
@SpringBootApplication
public class CRUDRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is from CRUDRunner");
        System.out.println(args.getOptionNames());
        System.out.println(args.getNonOptionArgs());
        System.out.println(args.getOptionValues("application.name"));
        System.out.println(args.containsOption("server.port"));
    }
}
