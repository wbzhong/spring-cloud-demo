package com.example.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/18 9:38
 * @Vision 1.0
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name){
        return restTemplate.getForObject("http://service-producer/hello?name="+name,String.class);
    }
}
