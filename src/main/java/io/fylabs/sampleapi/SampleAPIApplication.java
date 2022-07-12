package io.fylabs.sampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
@ComponentScan(basePackages = {"io.fylabs"})
public class SampleAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleAPIApplication.class, args);
    }

}
