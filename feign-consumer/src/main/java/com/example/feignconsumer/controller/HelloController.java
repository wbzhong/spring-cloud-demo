package com.example.feignconsumer.controller;

import com.example.feignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/18 10:14
 * @Vision 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService service;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam("name") String name){
        return service.sayHello(name);
    }

}
