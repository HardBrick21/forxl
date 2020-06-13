package com.hlx.controller;

import cn.hutool.json.JSONUtil;
import com.hlx.po.User;
import com.hlx.service.IUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: forxl
 * @BelongsPackage: com.hlx.controller
 * @Author: Hlx
 * @CreateTime: 2020/2/14
 * @Description:
 */
@RestController
public class TestController {

    private final IUserService userService;

    public TestController(IUserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hello")
    public String Helllo() {
        return "Hello World";
    }

    @GetMapping("/getAll")
    public String getAllUser() {

        List<User> list = userService.list();
        return JSONUtil.toJsonStr(list);
    }

}
