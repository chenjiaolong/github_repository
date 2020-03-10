package com.along;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.along.mapper")
public class MybatisApplication extends SpringBootServletInitializer {


//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(MybatisApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}
