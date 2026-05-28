package com.yike.yikeaiuser;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.yike.yikeaiuser.mapper")
@ComponentScan("com.yike")
public class YikeAiUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(YikeAiUserApplication.class, args);
    }
}
