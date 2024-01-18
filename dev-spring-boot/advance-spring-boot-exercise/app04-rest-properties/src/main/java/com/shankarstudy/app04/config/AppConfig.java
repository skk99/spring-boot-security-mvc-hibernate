package com.shankarstudy.app04.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> System.out.println("This is from CommandLineRunner");
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> System.out.println("This is from ApplicationRunner");
    }
}
