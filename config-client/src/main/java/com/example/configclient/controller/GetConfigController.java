package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @ClassName GetConfigController
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/19 11:25
 * @Vision 1.0
 */
@RestController
@RefreshScope
public class GetConfigController {
    @Value("${info.profile:error}")
    String profile;

    @GetMapping("/info")
    public Mono<String> info(){
        return Mono.justOrEmpty(profile);
    }
}
