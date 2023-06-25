package org.product.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProducerRestApp {

    public static void main(String[] args) {
        SpringApplication.run(ProducerRestApp.class, args);
    }

}