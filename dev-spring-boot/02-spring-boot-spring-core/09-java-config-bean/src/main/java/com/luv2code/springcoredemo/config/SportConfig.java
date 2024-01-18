package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // @Bean use case is to take existing third-party class and expose as a Spring bean
//    @Bean  // bean id defaults to the method name
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
