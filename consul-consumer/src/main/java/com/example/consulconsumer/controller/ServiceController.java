package com.example.consulconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ServiceController
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/17 17:46
 * @Vision 1.0
 */
@RestController
public class ServiceController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    //获取所有服务
    @GetMapping("/services")
    public Object services(){
        return discoveryClient.getInstances("service-producer");
    }

    //获取其中一个服务
    @GetMapping("/discover")
    public Object discover(){
        return loadBalancerClient.choose("service-producer").getUri().toString();
    }
}
