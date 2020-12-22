package com.example.nullroutine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController {
    /**
     * 入门案例
     */
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello SpringMVC");
        return "success";
    }

    /**
     * @return
     */
    @RequestMapping(value = "/testRequestMapping", params = {"username=heihei"},headers = {"Accept"})
    public String test() {
        System.out.println("测试requestMapping注解");
        return "success";
    }
}
