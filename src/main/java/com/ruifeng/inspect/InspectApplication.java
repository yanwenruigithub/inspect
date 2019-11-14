package com.ruifeng.inspect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ruifeng.inspect.mapper")
public class InspectApplication {

    public static void main(String[] args) {
        SpringApplication.run(InspectApplication.class, args);
    }

}
