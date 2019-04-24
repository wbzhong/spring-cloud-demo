package com.example.ribbonhystrix.controller;

import com.example.ribbonhystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/18 10:44
 * @Vision 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name ){
        return helloService.hiService(name);
    }
}
