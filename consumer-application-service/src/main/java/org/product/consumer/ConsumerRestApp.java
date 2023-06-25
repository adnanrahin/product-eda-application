package org.product.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ConsumerRestApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRestApp.class, args);
    }

}