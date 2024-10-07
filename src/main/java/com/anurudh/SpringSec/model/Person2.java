package com.anurudh.SpringSec.model;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class Person2 {
    // public String name ="Ankit";

    @Bean
     Person createdPersonObject(){
        return new Person();
    }
}
