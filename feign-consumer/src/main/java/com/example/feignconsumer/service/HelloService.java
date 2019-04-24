package com.example.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/18 10:22
 * @Vision 1.0
 */
@FeignClient("service-producer")
public interface HelloService {
    @GetMapping("/hello")
    String sayHello(@RequestParam("name") String name);
}
