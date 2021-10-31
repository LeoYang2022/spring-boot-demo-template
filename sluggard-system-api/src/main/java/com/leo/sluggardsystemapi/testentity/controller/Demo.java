package com.leo.sluggardsystemapi.testentity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: LeoYang
 * @Date: 2021/10/31 23:29
 * @Version: 1.0
 */
@RestController
public class Demo {
    @GetMapping("/test/{param}")
    public String sayHello(@PathVariable("param") String param) {
        return "Hello World " + param;
    }
}
