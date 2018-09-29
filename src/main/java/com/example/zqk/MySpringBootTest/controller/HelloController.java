package com.example.zqk.MySpringBootTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZHOUQIANKUN009
 * @date 2018/9/29
 * @说明：
 */

@RestController
public class HelloController {

    @RequestMapping
    public String hello(){
        return "hello world!";
    }
}
