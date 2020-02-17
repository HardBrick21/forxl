package com.hlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.controller
 * @Author: Hlx
 * @CreateTime: 2020/2/14
 * @Description:
 */
@SpringBootApplication
@RestController
public class application {

    @RequestMapping("/")
    public String HelloSpring(){
        return "Hello Spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
