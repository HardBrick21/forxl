package com.hlx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.controller
 * @Author: Hlx
 * @CreateTime: 2020/2/14
 * @Description:
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String Helllo(){
        return "Hello World";
    }
}
