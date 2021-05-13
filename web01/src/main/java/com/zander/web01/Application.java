package com.zander.web01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zander.web01.dao") //定义扫描mapper
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
