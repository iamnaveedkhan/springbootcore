package com.naveed.springbootcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfiguration {
    @Bean
    public Employee createEmployee(){
        System.out.println("\n createEmployee method called \n");
        return new Employee();
    }   
}
