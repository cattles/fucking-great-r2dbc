package com.example.r2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

/**
 * @Date 2020-05-24
 * @author 稻草鸟人
 */
@SpringBootApplication
@EnableR2dbcRepositories
public class FuckingGreatR2dbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuckingGreatR2dbcApplication.class, args);
    }

}
