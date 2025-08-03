package com.tnsif.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext var = SpringApplication.run(DiApplication.class, args);

        Customer3 c1 = var.getBean(Customer3.class);
        c1.disply();
     
    }

}