package com.liucy.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author 刘呈洋
 */
@SpringBootApplication
@MapperScan("com.liucy.server.mapper")
@EnableScheduling
public class OfficeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(OfficeManagementApplication.class, args);
    }
}
