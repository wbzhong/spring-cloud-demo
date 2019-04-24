package com.example.consulgateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FallbackController
 * @Description TODO
 * @Author zwb
 * @Date 2019/4/19 10:03
 * @Vision 1.0
 */
@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public String fallback(){
        return "error! there are something wrong with server";
    }
}
