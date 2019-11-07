package com.atguigu.nacosprovider.controller;/*
@author kankan
@create 2019-10-28 11:49
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope  //此注解refreshScope只能添加在调用的controller方法上。
@RestController
@RequestMapping("provider")
public class ProviderController {
    @Value("${myName}")
    private String name;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${redis.url}")
    private String redisUrl;

    @GetMapping("hello")
    public String hello(){
        return "hello=========="+name+"redisUrl="+redisUrl+"jdbcUrl="+jdbcUrl;
    }
}
