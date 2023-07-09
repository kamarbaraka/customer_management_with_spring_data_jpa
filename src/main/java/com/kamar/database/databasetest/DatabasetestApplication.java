package com.kamar.database.databasetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DatabasetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabasetestApplication.class, args);
    }

}
