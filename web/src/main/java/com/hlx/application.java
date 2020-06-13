package com.hlx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.controller
 * @Author: Hlx
 * @CreateTime: 2020/2/14
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.hlx.mapper")
public class application {

    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
