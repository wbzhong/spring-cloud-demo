package com.example.consulproducer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/17 17:16
 * @Vision 1.0
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }
    @GetMapping("/foo")
    public String foo(@RequestParam("foo") String foo){
        return "foo "+foo +", i am from port: "+port;
    }
}
