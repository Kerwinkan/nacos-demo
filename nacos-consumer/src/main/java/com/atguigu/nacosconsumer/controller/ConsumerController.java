package com.atguigu.nacosconsumer.controller;/*
@author kankan
@create 2019-10-28 18:13
*/

import com.atguigu.nacosconsumer.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("hi")
    public String hi() {
        return "hi i'm consumer!222222222222222222" + this.providerFeign.hello();
    }
}
