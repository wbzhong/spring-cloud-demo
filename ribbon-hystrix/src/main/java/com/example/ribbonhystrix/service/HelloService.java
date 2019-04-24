package com.example.ribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/18 10:39
 * @Vision 1.0
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
    }

    public String hystrixError(String name){
        return "sorry "+name +"the server exists some errors ";
    }
}
