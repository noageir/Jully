package com.july.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Noageir
 * Date: 2017/7/21.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.july.springboot.mapper")
public class JulyApplication {
    public static void main(String[] args) {
        SpringApplication.run(JulyApplication.class, args);

    }
}
