package com.imooc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desription:
 *
 * @ClassName UserController
 * @Author Zhanyuwei
 * @Date 2019/10/16 23:44
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String userTest(){
        return "ok";
    }
}
